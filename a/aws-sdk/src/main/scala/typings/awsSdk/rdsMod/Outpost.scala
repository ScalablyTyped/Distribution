package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outpost extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var Arn: js.UndefOr[String] = js.undefined
}
object Outpost {
  
  @scala.inline
  def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  
  @scala.inline
  implicit class OutpostMutableBuilder[Self <: Outpost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
