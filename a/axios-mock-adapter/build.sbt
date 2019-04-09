organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-a3ccf2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-184564",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-cc48c5",
  "org.scalablytyped" %%% "follow-redirects" % "1.5-dt-20190402Z-dc7d94",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-7f14ed",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        