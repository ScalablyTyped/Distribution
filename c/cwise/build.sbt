organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20200515Z-d73600"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20200515Z-6edaeb",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20200515Z-c76af2",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20200515Z-05ba94",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
