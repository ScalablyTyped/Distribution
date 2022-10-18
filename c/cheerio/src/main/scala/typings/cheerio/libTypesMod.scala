package typings.cheerio

import typings.cheerio.libCheerioMod.Cheerio
import typings.domhandler.libNodeMod.AnyNode
import typings.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type AcceptedElems[T /* <: AnyNode */] = BasicAcceptedElems[T] | (js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, BasicAcceptedElems[T]])
  
  type AcceptedFilters[T] = String | FilterFunction[T] | T | Cheerio[T]
  
  type AlphaNumeric = LowercaseLetters | Uppercase[LowercaseLetters] | (/* template literal string: ${number} */ String)
  
  type BasicAcceptedElems[T /* <: AnyNode */] = Cheerio[T] | js.Array[T] | T | String
  
  type FilterFunction[T] = js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cheerio.cheerioStrings.a
    - typings.cheerio.cheerioStrings.b
    - typings.cheerio.cheerioStrings.c
    - typings.cheerio.cheerioStrings.d
    - typings.cheerio.cheerioStrings.e
    - typings.cheerio.cheerioStrings.f
    - typings.cheerio.cheerioStrings.g
    - typings.cheerio.cheerioStrings.h
    - typings.cheerio.cheerioStrings.i
    - typings.cheerio.cheerioStrings.j
    - typings.cheerio.cheerioStrings.k
    - typings.cheerio.cheerioStrings.l
    - typings.cheerio.cheerioStrings.m
    - typings.cheerio.cheerioStrings.n
    - typings.cheerio.cheerioStrings.o
    - typings.cheerio.cheerioStrings.p
    - typings.cheerio.cheerioStrings.q
    - typings.cheerio.cheerioStrings.r
    - typings.cheerio.cheerioStrings.s
    - typings.cheerio.cheerioStrings.t
    - typings.cheerio.cheerioStrings.u
    - typings.cheerio.cheerioStrings.v
    - typings.cheerio.cheerioStrings.w
    - typings.cheerio.cheerioStrings.x
    - typings.cheerio.cheerioStrings.y
    - typings.cheerio.cheerioStrings.z
  */
  trait LowercaseLetters extends StObject
  object LowercaseLetters {
    
    inline def a: typings.cheerio.cheerioStrings.a = "a".asInstanceOf[typings.cheerio.cheerioStrings.a]
    
    inline def b: typings.cheerio.cheerioStrings.b = "b".asInstanceOf[typings.cheerio.cheerioStrings.b]
    
    inline def c: typings.cheerio.cheerioStrings.c = "c".asInstanceOf[typings.cheerio.cheerioStrings.c]
    
    inline def d: typings.cheerio.cheerioStrings.d = "d".asInstanceOf[typings.cheerio.cheerioStrings.d]
    
    inline def e: typings.cheerio.cheerioStrings.e = "e".asInstanceOf[typings.cheerio.cheerioStrings.e]
    
    inline def f: typings.cheerio.cheerioStrings.f = "f".asInstanceOf[typings.cheerio.cheerioStrings.f]
    
    inline def g: typings.cheerio.cheerioStrings.g = "g".asInstanceOf[typings.cheerio.cheerioStrings.g]
    
    inline def h: typings.cheerio.cheerioStrings.h = "h".asInstanceOf[typings.cheerio.cheerioStrings.h]
    
    inline def i: typings.cheerio.cheerioStrings.i = "i".asInstanceOf[typings.cheerio.cheerioStrings.i]
    
    inline def j: typings.cheerio.cheerioStrings.j = "j".asInstanceOf[typings.cheerio.cheerioStrings.j]
    
    inline def k: typings.cheerio.cheerioStrings.k = "k".asInstanceOf[typings.cheerio.cheerioStrings.k]
    
    inline def l: typings.cheerio.cheerioStrings.l = "l".asInstanceOf[typings.cheerio.cheerioStrings.l]
    
    inline def m: typings.cheerio.cheerioStrings.m = "m".asInstanceOf[typings.cheerio.cheerioStrings.m]
    
    inline def n: typings.cheerio.cheerioStrings.n = "n".asInstanceOf[typings.cheerio.cheerioStrings.n]
    
    inline def o: typings.cheerio.cheerioStrings.o = "o".asInstanceOf[typings.cheerio.cheerioStrings.o]
    
    inline def p: typings.cheerio.cheerioStrings.p = "p".asInstanceOf[typings.cheerio.cheerioStrings.p]
    
    inline def q: typings.cheerio.cheerioStrings.q = "q".asInstanceOf[typings.cheerio.cheerioStrings.q]
    
    inline def r: typings.cheerio.cheerioStrings.r = "r".asInstanceOf[typings.cheerio.cheerioStrings.r]
    
    inline def s: typings.cheerio.cheerioStrings.s = "s".asInstanceOf[typings.cheerio.cheerioStrings.s]
    
    inline def t: typings.cheerio.cheerioStrings.t = "t".asInstanceOf[typings.cheerio.cheerioStrings.t]
    
    inline def u: typings.cheerio.cheerioStrings.u = "u".asInstanceOf[typings.cheerio.cheerioStrings.u]
    
    inline def v: typings.cheerio.cheerioStrings.v = "v".asInstanceOf[typings.cheerio.cheerioStrings.v]
    
    inline def w: typings.cheerio.cheerioStrings.w = "w".asInstanceOf[typings.cheerio.cheerioStrings.w]
    
    inline def x: typings.cheerio.cheerioStrings.x = "x".asInstanceOf[typings.cheerio.cheerioStrings.x]
    
    inline def y: typings.cheerio.cheerioStrings.y = "y".asInstanceOf[typings.cheerio.cheerioStrings.y]
    
    inline def z: typings.cheerio.cheerioStrings.z = "z".asInstanceOf[typings.cheerio.cheerioStrings.z]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cheerio.cheerioStrings.Dot
    - typings.cheerio.cheerioStrings.Numbersign
    - typings.cheerio.cheerioStrings.Colon
    - typings.cheerio.cheerioStrings.Verticalline
    - typings.cheerio.cheerioStrings.Greaterthansign
    - typings.cheerio.cheerioStrings.Plussign
    - typings.cheerio.cheerioStrings.Tilde
    - typings.cheerio.cheerioStrings.`[`
  */
  trait SelectorSpecial extends StObject
  object SelectorSpecial {
    
    inline def Colon: typings.cheerio.cheerioStrings.Colon = ":".asInstanceOf[typings.cheerio.cheerioStrings.Colon]
    
    inline def Dot: typings.cheerio.cheerioStrings.Dot = ".".asInstanceOf[typings.cheerio.cheerioStrings.Dot]
    
    inline def Greaterthansign: typings.cheerio.cheerioStrings.Greaterthansign = ">".asInstanceOf[typings.cheerio.cheerioStrings.Greaterthansign]
    
    inline def Numbersign: typings.cheerio.cheerioStrings.Numbersign = "#".asInstanceOf[typings.cheerio.cheerioStrings.Numbersign]
    
    inline def Plussign: typings.cheerio.cheerioStrings.Plussign = "+".asInstanceOf[typings.cheerio.cheerioStrings.Plussign]
    
    inline def Tilde: typings.cheerio.cheerioStrings.Tilde = "~".asInstanceOf[typings.cheerio.cheerioStrings.Tilde]
    
    inline def Verticalline: typings.cheerio.cheerioStrings.Verticalline = "|".asInstanceOf[typings.cheerio.cheerioStrings.Verticalline]
    
    inline def `[`: typings.cheerio.cheerioStrings.`[` = "[".asInstanceOf[typings.cheerio.cheerioStrings.`[`]
  }
  
  type SelectorType = /* template literal string: ${SelectorSpecial}${AlphaNumeric}${string} */ String
}
