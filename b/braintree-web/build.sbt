organization := "org.scalablytyped"
name := "braintree-web"
version := "3.75-dt-20230316Z-4ae246"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "googlepay" % "0.7-dt-20230225Z-58e085",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20230214Z-543948",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
