organization := "com.scalablytyped"
name := "axe-webdriverjs"
version := "2.0-dt-20181018Z-85ecf9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "axe-core" % "3.1.2-e82448",
  "com.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181109Z-20b479",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        