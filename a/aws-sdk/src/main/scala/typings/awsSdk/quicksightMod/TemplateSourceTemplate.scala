package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSourceTemplate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn
}
object TemplateSourceTemplate {
  
  @scala.inline
  def apply(Arn: Arn): TemplateSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSourceTemplate]
  }
  
  @scala.inline
  implicit class TemplateSourceTemplateMutableBuilder[Self <: TemplateSourceTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
