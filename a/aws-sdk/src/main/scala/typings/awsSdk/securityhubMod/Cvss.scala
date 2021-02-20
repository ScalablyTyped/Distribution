package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cvss extends StObject {
  
  /**
    * The base CVSS score.
    */
  var BaseScore: js.UndefOr[Double] = js.native
  
  /**
    * The base scoring vector for the CVSS score.
    */
  var BaseVector: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version of CVSS for the CVSS score.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
}
object Cvss {
  
  @scala.inline
  def apply(): Cvss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvss]
  }
  
  @scala.inline
  implicit class CvssMutableBuilder[Self <: Cvss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseScore(value: Double): Self = StObject.set(x, "BaseScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseScoreUndefined: Self = StObject.set(x, "BaseScore", js.undefined)
    
    @scala.inline
    def setBaseVector(value: NonEmptyString): Self = StObject.set(x, "BaseVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVectorUndefined: Self = StObject.set(x, "BaseVector", js.undefined)
    
    @scala.inline
    def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
