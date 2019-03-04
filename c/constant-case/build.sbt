organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-0be9b9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-e04dbe",
  "org.scalablytyped" %%% "no-case" % "2.3.2-0f7868",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-a1100b",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-7522dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        