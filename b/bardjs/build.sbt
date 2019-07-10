organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20190322Z-0089f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190709Z-e41730",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-f64226",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190530Z-66dcee",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        