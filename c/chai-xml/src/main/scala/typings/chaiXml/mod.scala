package typings.chaiXml

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chaiXml.mod.ChaiXml.XmlAssertion
import typings.chaiXml.mod.global.Chai.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-xml", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  object ChaiXml {
    
    @js.native
    trait XmlAssertion extends Assertion {
      
      var and: XmlAssertion = js.native
      
      var at: XmlAssertion = js.native
      
      var be: XmlAssertion = js.native
      
      var been: XmlAssertion = js.native
      
      var has: XmlAssertion = js.native
      
      var have: XmlAssertion = js.native
      
      var is: XmlAssertion = js.native
      
      var not: XmlAssertion = js.native
      
      var of: XmlAssertion = js.native
      
      var same: XmlAssertion = js.native
      
      var that: XmlAssertion = js.native
      
      var to: XmlAssertion = js.native
      
      def valid(): XmlAssertion = js.native
      
      var which: XmlAssertion = js.native
      
      var `with`: XmlAssertion = js.native
    }
    object XmlAssertion {
      
      @scala.inline
      def apply(
        and: XmlAssertion,
        at: XmlAssertion,
        be: XmlAssertion,
        been: XmlAssertion,
        has: XmlAssertion,
        have: XmlAssertion,
        is: XmlAssertion,
        not: XmlAssertion,
        of: XmlAssertion,
        same: XmlAssertion,
        that: XmlAssertion,
        to: XmlAssertion,
        valid: () => XmlAssertion,
        which: XmlAssertion,
        `with`: XmlAssertion,
        xml: XmlAssertion
      ): XmlAssertion = {
        val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = js.Any.fromFunction0(valid), which = which.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
        __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
        __obj.asInstanceOf[XmlAssertion]
      }
      
      @scala.inline
      implicit class XmlAssertionMutableBuilder[Self <: XmlAssertion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnd(value: XmlAssertion): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAt(value: XmlAssertion): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBe(value: XmlAssertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeen(value: XmlAssertion): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHas(value: XmlAssertion): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHave(value: XmlAssertion): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIs(value: XmlAssertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNot(value: XmlAssertion): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOf(value: XmlAssertion): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSame(value: XmlAssertion): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThat(value: XmlAssertion): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTo(value: XmlAssertion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValid(value: () => XmlAssertion): Self = StObject.set(x, "valid", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWhich(value: XmlAssertion): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWith(value: XmlAssertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
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
        
        var xml: XmlAssertion = js.native
      }
      object Assertion {
        
        @scala.inline
        def apply(xml: XmlAssertion): Assertion = {
          val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit class AssertionMutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setXml(value: XmlAssertion): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
