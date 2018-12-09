organization := "org.scalablytyped"
name := "chrome-apps"
version := "0.0-unknown-dt-20181116Z-70d17f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180910Z-e36ad1",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180910Z-20df70",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        