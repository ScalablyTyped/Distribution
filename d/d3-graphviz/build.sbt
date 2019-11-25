organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-ecf7c6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-a559ed",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-8560c7",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-db38c1",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-3df0c6",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-74daf3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        