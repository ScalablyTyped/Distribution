organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190326Z-833baf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-caa3ad",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20190312Z-361ffc",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-1923a3",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        