organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20190808Z-842915"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190812Z-ad1bc0",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20191022Z-a94ee8",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20190530Z-c3a373",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        