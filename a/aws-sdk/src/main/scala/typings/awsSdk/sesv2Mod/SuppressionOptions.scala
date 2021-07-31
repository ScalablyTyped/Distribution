package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressionOptions extends StObject {
  
  /**
    * A list that contains the reasons that email addresses are automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
}
object SuppressionOptions {
  
  @scala.inline
  def apply(): SuppressionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressionOptions]
  }
  
  @scala.inline
  implicit class SuppressionOptionsMutableBuilder[Self <: SuppressionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuppressedReasons(value: SuppressionListReasons): Self = StObject.set(x, "SuppressedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressedReasonsUndefined: Self = StObject.set(x, "SuppressedReasons", js.undefined)
    
    @scala.inline
    def setSuppressedReasonsVarargs(value: SuppressionListReason*): Self = StObject.set(x, "SuppressedReasons", js.Array(value :_*))
  }
}
