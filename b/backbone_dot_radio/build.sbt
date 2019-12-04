organization := "org.scalablytyped"
name := "backbone_dot_radio"
version := "0.8-dt-20190619Z-dbcf8d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-a2a494",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-72186b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-6a6110")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        