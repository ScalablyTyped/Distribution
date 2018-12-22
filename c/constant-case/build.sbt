organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-c9af69"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-e49760",
  "org.scalablytyped" %%% "no-case" % "2.3.2-a9e058",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-65954d",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-cb4b52")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        