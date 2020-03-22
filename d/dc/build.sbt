organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20200226Z-d0d389"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200225Z-ea946c",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200320Z-35059d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200225Z-afd0c0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
