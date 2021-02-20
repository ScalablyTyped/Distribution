organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.22-dt-20201111Z-4d9dd5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20201106Z-8ac191",
  "org.scalablytyped" %%% "braintree-web" % "3.62-dt-20200918Z-650765",
  "org.scalablytyped" %%% "googlepay" % "0.5-dt-20201030Z-120bb0",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20200828Z-6a7a60",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
