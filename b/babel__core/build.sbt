organization := "org.scalablytyped"
name := "babel__core"
version := "7.1-dt-20200225Z-877a92"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20191210Z-5fcce3",
  "org.scalablytyped" %%% "babel__parser" % "7.9.2-73cb44",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20190213Z-5609a7",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200225Z-a36e13",
  "org.scalablytyped" %%% "babel__types" % "7.9.0-ec20a6",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
