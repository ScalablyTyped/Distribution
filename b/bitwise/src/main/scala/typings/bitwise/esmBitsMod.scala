package typings.bitwise

import typings.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBitsMod {
  
  @JSImport("bitwise/esm/bits", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/bits", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def not(bits: js.Array[Bit]): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def reduceAnd(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceAnd")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    @scala.inline
    def reduceNand(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNand")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    @scala.inline
    def reduceNor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    @scala.inline
    def reduceOr(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceOr")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    @scala.inline
    def reduceXnor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXnor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    @scala.inline
    def reduceXor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
    
    @scala.inline
    def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
    
    @scala.inline
    def toString_(bits: js.Array[Bit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def toString_(bits: js.Array[Bit], spacing: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toString_(bits: js.Array[Bit], spacing: Double, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def toString_(bits: js.Array[Bit], spacing: Unit, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
    
    @scala.inline
    def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  }
  
  @scala.inline
  def and(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def nand(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nand")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def nor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def not(bits: js.Array[Bit]): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def or(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def reduceAnd(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceAnd")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
  
  @scala.inline
  def reduceNand(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNand")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
  
  @scala.inline
  def reduceNor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceNor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
  
  @scala.inline
  def reduceOr(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceOr")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
  
  @scala.inline
  def reduceXnor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXnor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
  
  @scala.inline
  def reduceXor(bits: js.Array[Bit]): Bit = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceXor")(bits.asInstanceOf[js.Any]).asInstanceOf[Bit]
  
  @scala.inline
  def toBoolean(bits: js.Array[Bit]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
  
  @scala.inline
  def toString_(bits: js.Array[Bit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toString_(bits: js.Array[Bit], spacing: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toString_(bits: js.Array[Bit], spacing: Double, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toString_(bits: js.Array[Bit], spacing: Unit, spacer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(bits.asInstanceOf[js.Any], spacing.asInstanceOf[js.Any], spacer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def xnor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("xnor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
  
  @scala.inline
  def xor(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
}
