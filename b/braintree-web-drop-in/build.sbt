organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.22-dt-20201111Z-ea92d8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20201106Z-09448d",
  "org.scalablytyped" %%% "braintree-web" % "3.62-dt-20200918Z-fec46e",
  "org.scalablytyped" %%% "googlepay" % "0.5-dt-20201030Z-c9809c",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20200828Z-3a4f3c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
