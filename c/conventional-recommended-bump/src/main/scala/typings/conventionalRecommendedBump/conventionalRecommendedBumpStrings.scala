package typings.conventionalRecommendedBump

import typings.conventionalRecommendedBump.mod.Callback.Recommendation.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conventionalRecommendedBumpStrings {
  
  @js.native
  sealed trait major extends ReleaseType
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  
  @js.native
  sealed trait minor extends ReleaseType
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  
  @js.native
  sealed trait patch extends ReleaseType
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
}
