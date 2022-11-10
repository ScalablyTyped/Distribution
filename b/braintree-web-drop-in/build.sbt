organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.33-dt-20220926Z-6aa30c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "applepayjs" % "3.0-dt-20220301Z-5ea136",
  "org.scalablytyped" %%% "braintree-web" % "3.75-dt-20220916Z-036e3a",
  "org.scalablytyped" %%% "googlepay" % "0.6-dt-20220624Z-03caff",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20221108Z-800bd0",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
