organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-d10a5b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-f98b41",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-ef8e64",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-464816",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-221a74",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        