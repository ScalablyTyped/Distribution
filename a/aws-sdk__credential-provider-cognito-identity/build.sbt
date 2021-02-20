organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-cognito-identity"
version := "1.0.0-rc.7-86f671"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity" % "1.0.0-rc.7-41a390",
  "org.scalablytyped" %%% "aws-sdk__protocol-http" % "1.0.0-rc.7-8328fc",
  "org.scalablytyped" %%% "aws-sdk__smithy-client" % "1.0.0-rc.7-ca5cf5",
  "org.scalablytyped" %%% "aws-sdk__types" % "1.0.0-rc.7-cfb321",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
