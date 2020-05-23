package typings.browserify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Core options pertaining to a Browserify instance, extended by user options
  */
trait CustomOptions
  extends /**
  * Custom properties can be defined on Options.
  * These options are forwarded along to module-deps and browser-pack directly.
  */
/* propName */ StringDictionary[js.Any] {
  /** the directory that Browserify starts bundling from for filenames that start with .. */
  var basedir: js.UndefOr[String] = js.undefined
}

object CustomOptions {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, basedir: String = null): CustomOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOptions]
  }
}

