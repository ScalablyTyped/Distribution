organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-0424d0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-5e5475",
  "org.scalablytyped" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-2c2c5e",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-22daf0",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        