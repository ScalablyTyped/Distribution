package typings.chaiHtml

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiHtml.mod.ChaiHtml.HtmlAssertion
import typings.chaiHtml.mod.global.Chai.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-html", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  object ChaiHtml {
    
    @js.native
    trait HtmlAssertion extends Assertion {
      
      var ignoringComments: Assertion = js.native
    }
    object HtmlAssertion {
      
      @scala.inline
      def apply(html: HtmlAssertion, ignoringComments: Assertion): HtmlAssertion = {
        val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], ignoringComments = ignoringComments.asInstanceOf[js.Any])
        __obj.asInstanceOf[HtmlAssertion]
      }
      
      @scala.inline
      implicit class HtmlAssertionMutableBuilder[Self <: HtmlAssertion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIgnoringComments(value: Assertion): Self = StObject.set(x, "ignoringComments", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        var html: HtmlAssertion = js.native
      }
      object Assertion {
        
        @scala.inline
        def apply(html: HtmlAssertion): Assertion = {
          val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit class AssertionMutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHtml(value: HtmlAssertion): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
