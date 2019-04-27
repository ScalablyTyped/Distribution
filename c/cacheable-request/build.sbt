organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190326Z-d17c70"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-a28a5c",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20190312Z-3136c4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-851b31",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        