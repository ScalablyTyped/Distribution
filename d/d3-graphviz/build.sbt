organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20200103Z-a64ded"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-ea946c",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-eef537",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-35059d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200129Z-0c20be",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d1608e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
