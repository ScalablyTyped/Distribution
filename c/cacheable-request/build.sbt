organization := "org.scalablytyped"
name := "cacheable-request"
version := "6.0-dt-20190326Z-33bfa1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "http-cache-semantics" % "4.0-dt-20190127Z-8ac2e5",
  "org.scalablytyped" %%% "keyv" % "3.1-dt-20190312Z-054876",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "responselike" % "1.0-dt-20190127Z-c19301",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        