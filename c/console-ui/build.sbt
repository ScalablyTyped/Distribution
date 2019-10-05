organization := "org.scalablytyped"
name := "console-ui"
version := "2.2-dt-20190926Z-a04368"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c9841d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-b128ef",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-251f35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        