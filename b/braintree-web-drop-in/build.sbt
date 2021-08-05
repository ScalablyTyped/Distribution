organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.22-dt-20201111Z-c60d2f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20201106Z-ef1c3c",
  "org.scalablytyped" %%% "braintree-web" % "3.62-dt-20200918Z-88fc8c",
  "org.scalablytyped" %%% "googlepay" % "0.5-dt-20201030Z-dffc5c",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20200828Z-63046d",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
