organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190326Z-7331bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-7197a1",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20190312Z-313246",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-c358e9",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        