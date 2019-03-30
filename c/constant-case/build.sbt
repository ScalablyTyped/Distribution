organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-56820c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-9a10d6",
  "org.scalablytyped" %%% "no-case" % "2.3.2-243389",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-d0a82d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-fe64d6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        