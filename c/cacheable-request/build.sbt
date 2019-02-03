organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190131Z-2bcf61"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-7a3fde",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20181231Z-88e3e4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-2244cc",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        