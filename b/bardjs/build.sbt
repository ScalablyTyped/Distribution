organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20180611Z-440740"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-d33dcd",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-1eef62",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-1708d5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        