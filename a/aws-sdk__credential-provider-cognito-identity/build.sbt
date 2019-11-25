organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-40f33d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-4ddf5c",
  "org.scalablytyped" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-d4093a",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-ff785b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        