organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190325Z-1c812c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-8a68c8",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20190312Z-5abb96",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-fd1cf5",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        