organization := "org.scalablytyped"
name := "babel-plugin-macros"
version := "2.8-dt-20200109Z-a80f69"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20190904Z-668d1e",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-81a36b",
  "org.scalablytyped" %%% "babel__parser" % "7.8.3-198bc9",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-b89c3c",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20191119Z-641c66",
  "org.scalablytyped" %%% "babel__types" % "7.8.3-920374",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        