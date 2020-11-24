package typings.bumpRegex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bumpRegexStrings {
  
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @scala.inline
  def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
  
  @js.native
  sealed trait major extends js.Object
  
  @js.native
  sealed trait minor extends js.Object
  
  @js.native
  sealed trait patch extends js.Object
  
  @js.native
  sealed trait prerelease extends js.Object
}
