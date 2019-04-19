organization := "org.scalablytyped"
name := "chrome"
version := "0.0-unknown-dt-20190418Z-95b45c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-7e2180",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-a874af",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        