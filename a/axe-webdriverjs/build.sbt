organization := "org.scalablytyped"
name := "axe-webdriverjs"
version := "2.0-dt-20181017Z-3c9846"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axe-core" % "3.1.2-ac6faa",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181204Z-701cba",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        