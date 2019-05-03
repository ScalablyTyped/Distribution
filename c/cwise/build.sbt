organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-e3b9db"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-d3321d",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-3fa1ee",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-8288d9",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        