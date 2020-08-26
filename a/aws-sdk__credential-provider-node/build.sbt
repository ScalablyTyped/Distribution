organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "0.1.0-preview.2-367377"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "0.1.0-preview.1-64eb1c",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "0.1.0-preview.1-3dfb92",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "0.1.0-preview.1-1266bc",
  "org.scalablytyped" %%% "aws-sdk__types" % "0.1.0-preview.1-2f2fc1",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
