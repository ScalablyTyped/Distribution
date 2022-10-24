organization := "org.scalablytyped"
name := "braintree-web"
version := "3.75-dt-20220916Z-d293c1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "googlepay" % "0.6-dt-20220624Z-f8256e",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20220214Z-d73460",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
