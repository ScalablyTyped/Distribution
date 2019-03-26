organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-dac90b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-d7e181",
  "org.scalablytyped" %%% "no-case" % "2.3.2-c732b8",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-70192e",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-db1c64")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        