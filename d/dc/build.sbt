organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20200515Z-b1167e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-bf03a2",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-63e92d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-982503",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
