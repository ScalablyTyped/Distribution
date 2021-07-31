organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.22-dt-20201111Z-432b7a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20201106Z-9d7637",
  "org.scalablytyped" %%% "braintree-web" % "3.62-dt-20200918Z-e8ed90",
  "org.scalablytyped" %%% "googlepay" % "0.5-dt-20201030Z-d17503",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20200828Z-1ceb1e",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
