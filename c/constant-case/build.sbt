organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-d54b27"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-6e1f08",
  "org.scalablytyped" %%% "no-case" % "2.3.2-288496",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-09191b",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-da6d8a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        