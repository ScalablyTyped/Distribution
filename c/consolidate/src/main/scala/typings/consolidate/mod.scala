package typings.consolidate

import org.scalablytyped.runtime.Shortcut
import typings.consolidate.anon.DictotherOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("consolidate", JSImport.Namespace)
  @js.native
  val ^ : Consolidate = js.native
  
  @js.native
  trait Consolidate extends ConsolidateType {
    
    /**
      * Clear the cache.
      *
      * @api public
      */
    def clearCache(): Unit = js.native
    
    /**
      * expose the instance of the engine
      */
    var requires: RequiresType = js.native
  }
  
  /* Inlined {[ engine in consolidate.consolidate.SupportedTemplateEngines ]: consolidate.consolidate.RendererInterface} */
  @js.native
  trait ConsolidateType extends StObject {
    
    def `arc-templates`(path: String): typings.bluebird.mod.^[String] = js.native
    def `arc-templates`(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def `arc-templates`(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def `arc-templates`(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("arc-templates")
    var `arc-templates_Original`: RendererInterface = js.native
    
    def atpl(path: String): typings.bluebird.mod.^[String] = js.native
    def atpl(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def atpl(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def atpl(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("atpl")
    var atpl_Original: RendererInterface = js.native
    
    def bracket(path: String): typings.bluebird.mod.^[String] = js.native
    def bracket(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def bracket(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def bracket(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("bracket")
    var bracket_Original: RendererInterface = js.native
    
    def dot(path: String): typings.bluebird.mod.^[String] = js.native
    def dot(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def dot(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def dot(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("dot")
    var dot_Original: RendererInterface = js.native
    
    def dust(path: String): typings.bluebird.mod.^[String] = js.native
    def dust(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def dust(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def dust(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("dust")
    var dust_Original: RendererInterface = js.native
    
    def eco(path: String): typings.bluebird.mod.^[String] = js.native
    def eco(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def eco(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def eco(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("eco")
    var eco_Original: RendererInterface = js.native
    
    def ect(path: String): typings.bluebird.mod.^[String] = js.native
    def ect(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def ect(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def ect(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("ect")
    var ect_Original: RendererInterface = js.native
    
    def ejs(path: String): typings.bluebird.mod.^[String] = js.native
    def ejs(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def ejs(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def ejs(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("ejs")
    var ejs_Original: RendererInterface = js.native
    
    def haml(path: String): typings.bluebird.mod.^[String] = js.native
    def haml(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def haml(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def haml(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    
    def `haml-coffee`(path: String): typings.bluebird.mod.^[String] = js.native
    def `haml-coffee`(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def `haml-coffee`(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def `haml-coffee`(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("haml-coffee")
    var `haml-coffee_Original`: RendererInterface = js.native
    
    @JSName("haml")
    var haml_Original: RendererInterface = js.native
    
    def hamlet(path: String): typings.bluebird.mod.^[String] = js.native
    def hamlet(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def hamlet(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def hamlet(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("hamlet")
    var hamlet_Original: RendererInterface = js.native
    
    def handlebars(path: String): typings.bluebird.mod.^[String] = js.native
    def handlebars(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def handlebars(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def handlebars(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("handlebars")
    var handlebars_Original: RendererInterface = js.native
    
    def hogan(path: String): typings.bluebird.mod.^[String] = js.native
    def hogan(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def hogan(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def hogan(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("hogan")
    var hogan_Original: RendererInterface = js.native
    
    def htmling(path: String): typings.bluebird.mod.^[String] = js.native
    def htmling(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def htmling(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def htmling(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("htmling")
    var htmling_Original: RendererInterface = js.native
    
    def jade(path: String): typings.bluebird.mod.^[String] = js.native
    def jade(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def jade(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def jade(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("jade")
    var jade_Original: RendererInterface = js.native
    
    def jazz(path: String): typings.bluebird.mod.^[String] = js.native
    def jazz(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def jazz(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def jazz(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("jazz")
    var jazz_Original: RendererInterface = js.native
    
    def jqtpl(path: String): typings.bluebird.mod.^[String] = js.native
    def jqtpl(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def jqtpl(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def jqtpl(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("jqtpl")
    var jqtpl_Original: RendererInterface = js.native
    
    def just(path: String): typings.bluebird.mod.^[String] = js.native
    def just(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def just(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def just(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("just")
    var just_Original: RendererInterface = js.native
    
    def liquid(path: String): typings.bluebird.mod.^[String] = js.native
    def liquid(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def liquid(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def liquid(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("liquid")
    var liquid_Original: RendererInterface = js.native
    
    def liquor(path: String): typings.bluebird.mod.^[String] = js.native
    def liquor(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def liquor(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def liquor(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("liquor")
    var liquor_Original: RendererInterface = js.native
    
    def lodash(path: String): typings.bluebird.mod.^[String] = js.native
    def lodash(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def lodash(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def lodash(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("lodash")
    var lodash_Original: RendererInterface = js.native
    
    def marko(path: String): typings.bluebird.mod.^[String] = js.native
    def marko(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def marko(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def marko(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("marko")
    var marko_Original: RendererInterface = js.native
    
    def mote(path: String): typings.bluebird.mod.^[String] = js.native
    def mote(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def mote(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def mote(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("mote")
    var mote_Original: RendererInterface = js.native
    
    def mustache(path: String): typings.bluebird.mod.^[String] = js.native
    def mustache(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def mustache(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def mustache(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("mustache")
    var mustache_Original: RendererInterface = js.native
    
    def nunjucks(path: String): typings.bluebird.mod.^[String] = js.native
    def nunjucks(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def nunjucks(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def nunjucks(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("nunjucks")
    var nunjucks_Original: RendererInterface = js.native
    
    def plates(path: String): typings.bluebird.mod.^[String] = js.native
    def plates(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def plates(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def plates(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("plates")
    var plates_Original: RendererInterface = js.native
    
    def pug(path: String): typings.bluebird.mod.^[String] = js.native
    def pug(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def pug(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def pug(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("pug")
    var pug_Original: RendererInterface = js.native
    
    def qejs(path: String): typings.bluebird.mod.^[String] = js.native
    def qejs(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def qejs(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def qejs(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("qejs")
    var qejs_Original: RendererInterface = js.native
    
    def ractive(path: String): typings.bluebird.mod.^[String] = js.native
    def ractive(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def ractive(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def ractive(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("ractive")
    var ractive_Original: RendererInterface = js.native
    
    def razor(path: String): typings.bluebird.mod.^[String] = js.native
    def razor(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def razor(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def razor(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("razor")
    var razor_Original: RendererInterface = js.native
    
    def react(path: String): typings.bluebird.mod.^[String] = js.native
    def react(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def react(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def react(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("react")
    var react_Original: RendererInterface = js.native
    
    def slm(path: String): typings.bluebird.mod.^[String] = js.native
    def slm(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def slm(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def slm(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("slm")
    var slm_Original: RendererInterface = js.native
    
    def squirrelly(path: String): typings.bluebird.mod.^[String] = js.native
    def squirrelly(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def squirrelly(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def squirrelly(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("squirrelly")
    var squirrelly_Original: RendererInterface = js.native
    
    def swig(path: String): typings.bluebird.mod.^[String] = js.native
    def swig(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def swig(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def swig(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("swig")
    var swig_Original: RendererInterface = js.native
    
    def teacup(path: String): typings.bluebird.mod.^[String] = js.native
    def teacup(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def teacup(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def teacup(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("teacup")
    var teacup_Original: RendererInterface = js.native
    
    def templayed(path: String): typings.bluebird.mod.^[String] = js.native
    def templayed(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def templayed(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def templayed(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("templayed")
    var templayed_Original: RendererInterface = js.native
    
    def toffee(path: String): typings.bluebird.mod.^[String] = js.native
    def toffee(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def toffee(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def toffee(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("toffee")
    var toffee_Original: RendererInterface = js.native
    
    def twig(path: String): typings.bluebird.mod.^[String] = js.native
    def twig(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def twig(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def twig(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("twig")
    var twig_Original: RendererInterface = js.native
    
    def underscore(path: String): typings.bluebird.mod.^[String] = js.native
    def underscore(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def underscore(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def underscore(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("underscore")
    var underscore_Original: RendererInterface = js.native
    
    def vash(path: String): typings.bluebird.mod.^[String] = js.native
    def vash(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def vash(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def vash(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("vash")
    var vash_Original: RendererInterface = js.native
    
    def velocityjs(path: String): typings.bluebird.mod.^[String] = js.native
    def velocityjs(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def velocityjs(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def velocityjs(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("velocityjs")
    var velocityjs_Original: RendererInterface = js.native
    
    def walrus(path: String): typings.bluebird.mod.^[String] = js.native
    def walrus(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def walrus(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def walrus(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("walrus")
    var walrus_Original: RendererInterface = js.native
    
    def whiskers(path: String): typings.bluebird.mod.^[String] = js.native
    def whiskers(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def whiskers(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def whiskers(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    @JSName("whiskers")
    var whiskers_Original: RendererInterface = js.native
  }
  
  @js.native
  trait RendererInterface extends StObject {
    
    def apply(path: String): typings.bluebird.mod.^[String] = js.native
    def apply(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def apply(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def apply(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    
    def render(path: String): typings.bluebird.mod.^[String] = js.native
    def render(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
    def render(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def render(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.consolidate.consolidateStrings.extend
    - typings.consolidate.consolidateStrings.ReactDOM
    - typings.consolidate.consolidateStrings.babel
    - typings.consolidate.consolidateStrings.`arc-templates`
    - typings.consolidate.consolidateStrings.atpl
    - typings.consolidate.consolidateStrings.bracket
    - typings.consolidate.consolidateStrings.dot
    - typings.consolidate.consolidateStrings.dust
    - typings.consolidate.consolidateStrings.eco
    - typings.consolidate.consolidateStrings.ejs
    - typings.consolidate.consolidateStrings.ect
    - typings.consolidate.consolidateStrings.haml
    - typings.consolidate.consolidateStrings.`haml-coffee`
    - typings.consolidate.consolidateStrings.hamlet
    - typings.consolidate.consolidateStrings.handlebars
    - typings.consolidate.consolidateStrings.hogan
    - typings.consolidate.consolidateStrings.htmling
    - typings.consolidate.consolidateStrings.jade
    - typings.consolidate.consolidateStrings.jazz
    - typings.consolidate.consolidateStrings.jqtpl
    - typings.consolidate.consolidateStrings.just
    - typings.consolidate.consolidateStrings.liquid
    - typings.consolidate.consolidateStrings.liquor
    - typings.consolidate.consolidateStrings.lodash
    - typings.consolidate.consolidateStrings.marko
    - typings.consolidate.consolidateStrings.mote
    - typings.consolidate.consolidateStrings.mustache
    - typings.consolidate.consolidateStrings.nunjucks
    - typings.consolidate.consolidateStrings.plates
    - typings.consolidate.consolidateStrings.pug
    - typings.consolidate.consolidateStrings.qejs
    - typings.consolidate.consolidateStrings.ractive
    - typings.consolidate.consolidateStrings.razor
    - typings.consolidate.consolidateStrings.react
    - typings.consolidate.consolidateStrings.slm
    - typings.consolidate.consolidateStrings.squirrelly
    - typings.consolidate.consolidateStrings.swig
    - typings.consolidate.consolidateStrings.teacup
    - typings.consolidate.consolidateStrings.templayed
    - typings.consolidate.consolidateStrings.toffee
    - typings.consolidate.consolidateStrings.twig
    - typings.consolidate.consolidateStrings.underscore
    - typings.consolidate.consolidateStrings.vash
    - typings.consolidate.consolidateStrings.velocityjs
    - typings.consolidate.consolidateStrings.walrus
    - typings.consolidate.consolidateStrings.whiskers
  */
  trait Requires extends StObject
  object Requires {
    
    @scala.inline
    def ReactDOM: typings.consolidate.consolidateStrings.ReactDOM = "ReactDOM".asInstanceOf[typings.consolidate.consolidateStrings.ReactDOM]
    
    @scala.inline
    def `arc-templates`: typings.consolidate.consolidateStrings.`arc-templates` = "arc-templates".asInstanceOf[typings.consolidate.consolidateStrings.`arc-templates`]
    
    @scala.inline
    def atpl: typings.consolidate.consolidateStrings.atpl = "atpl".asInstanceOf[typings.consolidate.consolidateStrings.atpl]
    
    @scala.inline
    def babel: typings.consolidate.consolidateStrings.babel = "babel".asInstanceOf[typings.consolidate.consolidateStrings.babel]
    
    @scala.inline
    def bracket: typings.consolidate.consolidateStrings.bracket = "bracket".asInstanceOf[typings.consolidate.consolidateStrings.bracket]
    
    @scala.inline
    def dot: typings.consolidate.consolidateStrings.dot = "dot".asInstanceOf[typings.consolidate.consolidateStrings.dot]
    
    @scala.inline
    def dust: typings.consolidate.consolidateStrings.dust = "dust".asInstanceOf[typings.consolidate.consolidateStrings.dust]
    
    @scala.inline
    def eco: typings.consolidate.consolidateStrings.eco = "eco".asInstanceOf[typings.consolidate.consolidateStrings.eco]
    
    @scala.inline
    def ect: typings.consolidate.consolidateStrings.ect = "ect".asInstanceOf[typings.consolidate.consolidateStrings.ect]
    
    @scala.inline
    def ejs: typings.consolidate.consolidateStrings.ejs = "ejs".asInstanceOf[typings.consolidate.consolidateStrings.ejs]
    
    @scala.inline
    def extend: typings.consolidate.consolidateStrings.extend = "extend".asInstanceOf[typings.consolidate.consolidateStrings.extend]
    
    @scala.inline
    def haml: typings.consolidate.consolidateStrings.haml = "haml".asInstanceOf[typings.consolidate.consolidateStrings.haml]
    
    @scala.inline
    def `haml-coffee`: typings.consolidate.consolidateStrings.`haml-coffee` = "haml-coffee".asInstanceOf[typings.consolidate.consolidateStrings.`haml-coffee`]
    
    @scala.inline
    def hamlet: typings.consolidate.consolidateStrings.hamlet = "hamlet".asInstanceOf[typings.consolidate.consolidateStrings.hamlet]
    
    @scala.inline
    def handlebars: typings.consolidate.consolidateStrings.handlebars = "handlebars".asInstanceOf[typings.consolidate.consolidateStrings.handlebars]
    
    @scala.inline
    def hogan: typings.consolidate.consolidateStrings.hogan = "hogan".asInstanceOf[typings.consolidate.consolidateStrings.hogan]
    
    @scala.inline
    def htmling: typings.consolidate.consolidateStrings.htmling = "htmling".asInstanceOf[typings.consolidate.consolidateStrings.htmling]
    
    @scala.inline
    def jade: typings.consolidate.consolidateStrings.jade = "jade".asInstanceOf[typings.consolidate.consolidateStrings.jade]
    
    @scala.inline
    def jazz: typings.consolidate.consolidateStrings.jazz = "jazz".asInstanceOf[typings.consolidate.consolidateStrings.jazz]
    
    @scala.inline
    def jqtpl: typings.consolidate.consolidateStrings.jqtpl = "jqtpl".asInstanceOf[typings.consolidate.consolidateStrings.jqtpl]
    
    @scala.inline
    def just: typings.consolidate.consolidateStrings.just = "just".asInstanceOf[typings.consolidate.consolidateStrings.just]
    
    @scala.inline
    def liquid: typings.consolidate.consolidateStrings.liquid = "liquid".asInstanceOf[typings.consolidate.consolidateStrings.liquid]
    
    @scala.inline
    def liquor: typings.consolidate.consolidateStrings.liquor = "liquor".asInstanceOf[typings.consolidate.consolidateStrings.liquor]
    
    @scala.inline
    def lodash: typings.consolidate.consolidateStrings.lodash = "lodash".asInstanceOf[typings.consolidate.consolidateStrings.lodash]
    
    @scala.inline
    def marko: typings.consolidate.consolidateStrings.marko = "marko".asInstanceOf[typings.consolidate.consolidateStrings.marko]
    
    @scala.inline
    def mote: typings.consolidate.consolidateStrings.mote = "mote".asInstanceOf[typings.consolidate.consolidateStrings.mote]
    
    @scala.inline
    def mustache: typings.consolidate.consolidateStrings.mustache = "mustache".asInstanceOf[typings.consolidate.consolidateStrings.mustache]
    
    @scala.inline
    def nunjucks: typings.consolidate.consolidateStrings.nunjucks = "nunjucks".asInstanceOf[typings.consolidate.consolidateStrings.nunjucks]
    
    @scala.inline
    def plates: typings.consolidate.consolidateStrings.plates = "plates".asInstanceOf[typings.consolidate.consolidateStrings.plates]
    
    @scala.inline
    def pug: typings.consolidate.consolidateStrings.pug = "pug".asInstanceOf[typings.consolidate.consolidateStrings.pug]
    
    @scala.inline
    def qejs: typings.consolidate.consolidateStrings.qejs = "qejs".asInstanceOf[typings.consolidate.consolidateStrings.qejs]
    
    @scala.inline
    def ractive: typings.consolidate.consolidateStrings.ractive = "ractive".asInstanceOf[typings.consolidate.consolidateStrings.ractive]
    
    @scala.inline
    def razor: typings.consolidate.consolidateStrings.razor = "razor".asInstanceOf[typings.consolidate.consolidateStrings.razor]
    
    @scala.inline
    def react: typings.consolidate.consolidateStrings.react = "react".asInstanceOf[typings.consolidate.consolidateStrings.react]
    
    @scala.inline
    def slm: typings.consolidate.consolidateStrings.slm = "slm".asInstanceOf[typings.consolidate.consolidateStrings.slm]
    
    @scala.inline
    def squirrelly: typings.consolidate.consolidateStrings.squirrelly = "squirrelly".asInstanceOf[typings.consolidate.consolidateStrings.squirrelly]
    
    @scala.inline
    def swig: typings.consolidate.consolidateStrings.swig = "swig".asInstanceOf[typings.consolidate.consolidateStrings.swig]
    
    @scala.inline
    def teacup: typings.consolidate.consolidateStrings.teacup = "teacup".asInstanceOf[typings.consolidate.consolidateStrings.teacup]
    
    @scala.inline
    def templayed: typings.consolidate.consolidateStrings.templayed = "templayed".asInstanceOf[typings.consolidate.consolidateStrings.templayed]
    
    @scala.inline
    def toffee: typings.consolidate.consolidateStrings.toffee = "toffee".asInstanceOf[typings.consolidate.consolidateStrings.toffee]
    
    @scala.inline
    def twig: typings.consolidate.consolidateStrings.twig = "twig".asInstanceOf[typings.consolidate.consolidateStrings.twig]
    
    @scala.inline
    def underscore: typings.consolidate.consolidateStrings.underscore = "underscore".asInstanceOf[typings.consolidate.consolidateStrings.underscore]
    
    @scala.inline
    def vash: typings.consolidate.consolidateStrings.vash = "vash".asInstanceOf[typings.consolidate.consolidateStrings.vash]
    
    @scala.inline
    def velocityjs: typings.consolidate.consolidateStrings.velocityjs = "velocityjs".asInstanceOf[typings.consolidate.consolidateStrings.velocityjs]
    
    @scala.inline
    def walrus: typings.consolidate.consolidateStrings.walrus = "walrus".asInstanceOf[typings.consolidate.consolidateStrings.walrus]
    
    @scala.inline
    def whiskers: typings.consolidate.consolidateStrings.whiskers = "whiskers".asInstanceOf[typings.consolidate.consolidateStrings.whiskers]
  }
  
  /* Inlined {[ engine in consolidate.consolidate.Requires ]: any} */
  @js.native
  trait RequiresType extends StObject {
    
    var ReactDOM: js.Any = js.native
    
    var `arc-templates`: js.Any = js.native
    
    var atpl: js.Any = js.native
    
    var babel: js.Any = js.native
    
    var bracket: js.Any = js.native
    
    var dot: js.Any = js.native
    
    var dust: js.Any = js.native
    
    var eco: js.Any = js.native
    
    var ect: js.Any = js.native
    
    var ejs: js.Any = js.native
    
    var extend: js.Any = js.native
    
    var haml: js.Any = js.native
    
    var `haml-coffee`: js.Any = js.native
    
    var hamlet: js.Any = js.native
    
    var handlebars: js.Any = js.native
    
    var hogan: js.Any = js.native
    
    var htmling: js.Any = js.native
    
    var jade: js.Any = js.native
    
    var jazz: js.Any = js.native
    
    var jqtpl: js.Any = js.native
    
    var just: js.Any = js.native
    
    var liquid: js.Any = js.native
    
    var liquor: js.Any = js.native
    
    var lodash: js.Any = js.native
    
    var marko: js.Any = js.native
    
    var mote: js.Any = js.native
    
    var mustache: js.Any = js.native
    
    var nunjucks: js.Any = js.native
    
    var plates: js.Any = js.native
    
    var pug: js.Any = js.native
    
    var qejs: js.Any = js.native
    
    var ractive: js.Any = js.native
    
    var razor: js.Any = js.native
    
    var react: js.Any = js.native
    
    var slm: js.Any = js.native
    
    var squirrelly: js.Any = js.native
    
    var swig: js.Any = js.native
    
    var teacup: js.Any = js.native
    
    var templayed: js.Any = js.native
    
    var toffee: js.Any = js.native
    
    var twig: js.Any = js.native
    
    var underscore: js.Any = js.native
    
    var vash: js.Any = js.native
    
    var velocityjs: js.Any = js.native
    
    var walrus: js.Any = js.native
    
    var whiskers: js.Any = js.native
  }
  object RequiresType {
    
    @scala.inline
    def apply(
      ReactDOM: js.Any,
      `arc-templates`: js.Any,
      atpl: js.Any,
      babel: js.Any,
      bracket: js.Any,
      dot: js.Any,
      dust: js.Any,
      eco: js.Any,
      ect: js.Any,
      ejs: js.Any,
      extend: js.Any,
      haml: js.Any,
      `haml-coffee`: js.Any,
      hamlet: js.Any,
      handlebars: js.Any,
      hogan: js.Any,
      htmling: js.Any,
      jade: js.Any,
      jazz: js.Any,
      jqtpl: js.Any,
      just: js.Any,
      liquid: js.Any,
      liquor: js.Any,
      lodash: js.Any,
      marko: js.Any,
      mote: js.Any,
      mustache: js.Any,
      nunjucks: js.Any,
      plates: js.Any,
      pug: js.Any,
      qejs: js.Any,
      ractive: js.Any,
      razor: js.Any,
      react: js.Any,
      slm: js.Any,
      squirrelly: js.Any,
      swig: js.Any,
      teacup: js.Any,
      templayed: js.Any,
      toffee: js.Any,
      twig: js.Any,
      underscore: js.Any,
      vash: js.Any,
      velocityjs: js.Any,
      walrus: js.Any,
      whiskers: js.Any
    ): RequiresType = {
      val __obj = js.Dynamic.literal(ReactDOM = ReactDOM.asInstanceOf[js.Any], atpl = atpl.asInstanceOf[js.Any], babel = babel.asInstanceOf[js.Any], bracket = bracket.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], dust = dust.asInstanceOf[js.Any], eco = eco.asInstanceOf[js.Any], ect = ect.asInstanceOf[js.Any], ejs = ejs.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], haml = haml.asInstanceOf[js.Any], hamlet = hamlet.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], hogan = hogan.asInstanceOf[js.Any], htmling = htmling.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], jazz = jazz.asInstanceOf[js.Any], jqtpl = jqtpl.asInstanceOf[js.Any], just = just.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], liquor = liquor.asInstanceOf[js.Any], lodash = lodash.asInstanceOf[js.Any], marko = marko.asInstanceOf[js.Any], mote = mote.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nunjucks = nunjucks.asInstanceOf[js.Any], plates = plates.asInstanceOf[js.Any], pug = pug.asInstanceOf[js.Any], qejs = qejs.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any], razor = razor.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], squirrelly = squirrelly.asInstanceOf[js.Any], swig = swig.asInstanceOf[js.Any], teacup = teacup.asInstanceOf[js.Any], templayed = templayed.asInstanceOf[js.Any], toffee = toffee.asInstanceOf[js.Any], twig = twig.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], vash = vash.asInstanceOf[js.Any], velocityjs = velocityjs.asInstanceOf[js.Any], walrus = walrus.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.updateDynamic("arc-templates")(`arc-templates`.asInstanceOf[js.Any])
      __obj.updateDynamic("haml-coffee")(`haml-coffee`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiresType]
    }
    
    @scala.inline
    implicit class RequiresTypeMutableBuilder[Self <: RequiresType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setArc-templates`(value: js.Any): Self = StObject.set(x, "arc-templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtpl(value: js.Any): Self = StObject.set(x, "atpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabel(value: js.Any): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBracket(value: js.Any): Self = StObject.set(x, "bracket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDot(value: js.Any): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDust(value: js.Any): Self = StObject.set(x, "dust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEco(value: js.Any): Self = StObject.set(x, "eco", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEct(value: js.Any): Self = StObject.set(x, "ect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEjs(value: js.Any): Self = StObject.set(x, "ejs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtend(value: js.Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaml(value: js.Any): Self = StObject.set(x, "haml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHaml-coffee`(value: js.Any): Self = StObject.set(x, "haml-coffee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHamlet(value: js.Any): Self = StObject.set(x, "hamlet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlebars(value: js.Any): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHogan(value: js.Any): Self = StObject.set(x, "hogan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmling(value: js.Any): Self = StObject.set(x, "htmling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJade(value: js.Any): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJazz(value: js.Any): Self = StObject.set(x, "jazz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJqtpl(value: js.Any): Self = StObject.set(x, "jqtpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJust(value: js.Any): Self = StObject.set(x, "just", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiquid(value: js.Any): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiquor(value: js.Any): Self = StObject.set(x, "liquor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLodash(value: js.Any): Self = StObject.set(x, "lodash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarko(value: js.Any): Self = StObject.set(x, "marko", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMote(value: js.Any): Self = StObject.set(x, "mote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMustache(value: js.Any): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNunjucks(value: js.Any): Self = StObject.set(x, "nunjucks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlates(value: js.Any): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPug(value: js.Any): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQejs(value: js.Any): Self = StObject.set(x, "qejs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRactive(value: js.Any): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRazor(value: js.Any): Self = StObject.set(x, "razor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReact(value: js.Any): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactDOM(value: js.Any): Self = StObject.set(x, "ReactDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlm(value: js.Any): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquirrelly(value: js.Any): Self = StObject.set(x, "squirrelly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwig(value: js.Any): Self = StObject.set(x, "swig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeacup(value: js.Any): Self = StObject.set(x, "teacup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplayed(value: js.Any): Self = StObject.set(x, "templayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToffee(value: js.Any): Self = StObject.set(x, "toffee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwig(value: js.Any): Self = StObject.set(x, "twig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderscore(value: js.Any): Self = StObject.set(x, "underscore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVash(value: js.Any): Self = StObject.set(x, "vash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityjs(value: js.Any): Self = StObject.set(x, "velocityjs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWalrus(value: js.Any): Self = StObject.set(x, "walrus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiskers(value: js.Any): Self = StObject.set(x, "whiskers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.consolidate.consolidateStrings.`arc-templates`
    - typings.consolidate.consolidateStrings.atpl
    - typings.consolidate.consolidateStrings.bracket
    - typings.consolidate.consolidateStrings.dot
    - typings.consolidate.consolidateStrings.dust
    - typings.consolidate.consolidateStrings.eco
    - typings.consolidate.consolidateStrings.ejs
    - typings.consolidate.consolidateStrings.ect
    - typings.consolidate.consolidateStrings.haml
    - typings.consolidate.consolidateStrings.`haml-coffee`
    - typings.consolidate.consolidateStrings.hamlet
    - typings.consolidate.consolidateStrings.handlebars
    - typings.consolidate.consolidateStrings.hogan
    - typings.consolidate.consolidateStrings.htmling
    - typings.consolidate.consolidateStrings.jade
    - typings.consolidate.consolidateStrings.jazz
    - typings.consolidate.consolidateStrings.jqtpl
    - typings.consolidate.consolidateStrings.just
    - typings.consolidate.consolidateStrings.liquid
    - typings.consolidate.consolidateStrings.liquor
    - typings.consolidate.consolidateStrings.lodash
    - typings.consolidate.consolidateStrings.marko
    - typings.consolidate.consolidateStrings.mote
    - typings.consolidate.consolidateStrings.mustache
    - typings.consolidate.consolidateStrings.nunjucks
    - typings.consolidate.consolidateStrings.plates
    - typings.consolidate.consolidateStrings.pug
    - typings.consolidate.consolidateStrings.qejs
    - typings.consolidate.consolidateStrings.ractive
    - typings.consolidate.consolidateStrings.razor
    - typings.consolidate.consolidateStrings.react
    - typings.consolidate.consolidateStrings.slm
    - typings.consolidate.consolidateStrings.squirrelly
    - typings.consolidate.consolidateStrings.swig
    - typings.consolidate.consolidateStrings.teacup
    - typings.consolidate.consolidateStrings.templayed
    - typings.consolidate.consolidateStrings.toffee
    - typings.consolidate.consolidateStrings.twig
    - typings.consolidate.consolidateStrings.underscore
    - typings.consolidate.consolidateStrings.vash
    - typings.consolidate.consolidateStrings.velocityjs
    - typings.consolidate.consolidateStrings.walrus
    - typings.consolidate.consolidateStrings.whiskers
  */
  trait SupportedTemplateEngines extends StObject
  object SupportedTemplateEngines {
    
    @scala.inline
    def `arc-templates`: typings.consolidate.consolidateStrings.`arc-templates` = "arc-templates".asInstanceOf[typings.consolidate.consolidateStrings.`arc-templates`]
    
    @scala.inline
    def atpl: typings.consolidate.consolidateStrings.atpl = "atpl".asInstanceOf[typings.consolidate.consolidateStrings.atpl]
    
    @scala.inline
    def bracket: typings.consolidate.consolidateStrings.bracket = "bracket".asInstanceOf[typings.consolidate.consolidateStrings.bracket]
    
    @scala.inline
    def dot: typings.consolidate.consolidateStrings.dot = "dot".asInstanceOf[typings.consolidate.consolidateStrings.dot]
    
    @scala.inline
    def dust: typings.consolidate.consolidateStrings.dust = "dust".asInstanceOf[typings.consolidate.consolidateStrings.dust]
    
    @scala.inline
    def eco: typings.consolidate.consolidateStrings.eco = "eco".asInstanceOf[typings.consolidate.consolidateStrings.eco]
    
    @scala.inline
    def ect: typings.consolidate.consolidateStrings.ect = "ect".asInstanceOf[typings.consolidate.consolidateStrings.ect]
    
    @scala.inline
    def ejs: typings.consolidate.consolidateStrings.ejs = "ejs".asInstanceOf[typings.consolidate.consolidateStrings.ejs]
    
    @scala.inline
    def haml: typings.consolidate.consolidateStrings.haml = "haml".asInstanceOf[typings.consolidate.consolidateStrings.haml]
    
    @scala.inline
    def `haml-coffee`: typings.consolidate.consolidateStrings.`haml-coffee` = "haml-coffee".asInstanceOf[typings.consolidate.consolidateStrings.`haml-coffee`]
    
    @scala.inline
    def hamlet: typings.consolidate.consolidateStrings.hamlet = "hamlet".asInstanceOf[typings.consolidate.consolidateStrings.hamlet]
    
    @scala.inline
    def handlebars: typings.consolidate.consolidateStrings.handlebars = "handlebars".asInstanceOf[typings.consolidate.consolidateStrings.handlebars]
    
    @scala.inline
    def hogan: typings.consolidate.consolidateStrings.hogan = "hogan".asInstanceOf[typings.consolidate.consolidateStrings.hogan]
    
    @scala.inline
    def htmling: typings.consolidate.consolidateStrings.htmling = "htmling".asInstanceOf[typings.consolidate.consolidateStrings.htmling]
    
    @scala.inline
    def jade: typings.consolidate.consolidateStrings.jade = "jade".asInstanceOf[typings.consolidate.consolidateStrings.jade]
    
    @scala.inline
    def jazz: typings.consolidate.consolidateStrings.jazz = "jazz".asInstanceOf[typings.consolidate.consolidateStrings.jazz]
    
    @scala.inline
    def jqtpl: typings.consolidate.consolidateStrings.jqtpl = "jqtpl".asInstanceOf[typings.consolidate.consolidateStrings.jqtpl]
    
    @scala.inline
    def just: typings.consolidate.consolidateStrings.just = "just".asInstanceOf[typings.consolidate.consolidateStrings.just]
    
    @scala.inline
    def liquid: typings.consolidate.consolidateStrings.liquid = "liquid".asInstanceOf[typings.consolidate.consolidateStrings.liquid]
    
    @scala.inline
    def liquor: typings.consolidate.consolidateStrings.liquor = "liquor".asInstanceOf[typings.consolidate.consolidateStrings.liquor]
    
    @scala.inline
    def lodash: typings.consolidate.consolidateStrings.lodash = "lodash".asInstanceOf[typings.consolidate.consolidateStrings.lodash]
    
    @scala.inline
    def marko: typings.consolidate.consolidateStrings.marko = "marko".asInstanceOf[typings.consolidate.consolidateStrings.marko]
    
    @scala.inline
    def mote: typings.consolidate.consolidateStrings.mote = "mote".asInstanceOf[typings.consolidate.consolidateStrings.mote]
    
    @scala.inline
    def mustache: typings.consolidate.consolidateStrings.mustache = "mustache".asInstanceOf[typings.consolidate.consolidateStrings.mustache]
    
    @scala.inline
    def nunjucks: typings.consolidate.consolidateStrings.nunjucks = "nunjucks".asInstanceOf[typings.consolidate.consolidateStrings.nunjucks]
    
    @scala.inline
    def plates: typings.consolidate.consolidateStrings.plates = "plates".asInstanceOf[typings.consolidate.consolidateStrings.plates]
    
    @scala.inline
    def pug: typings.consolidate.consolidateStrings.pug = "pug".asInstanceOf[typings.consolidate.consolidateStrings.pug]
    
    @scala.inline
    def qejs: typings.consolidate.consolidateStrings.qejs = "qejs".asInstanceOf[typings.consolidate.consolidateStrings.qejs]
    
    @scala.inline
    def ractive: typings.consolidate.consolidateStrings.ractive = "ractive".asInstanceOf[typings.consolidate.consolidateStrings.ractive]
    
    @scala.inline
    def razor: typings.consolidate.consolidateStrings.razor = "razor".asInstanceOf[typings.consolidate.consolidateStrings.razor]
    
    @scala.inline
    def react: typings.consolidate.consolidateStrings.react = "react".asInstanceOf[typings.consolidate.consolidateStrings.react]
    
    @scala.inline
    def slm: typings.consolidate.consolidateStrings.slm = "slm".asInstanceOf[typings.consolidate.consolidateStrings.slm]
    
    @scala.inline
    def squirrelly: typings.consolidate.consolidateStrings.squirrelly = "squirrelly".asInstanceOf[typings.consolidate.consolidateStrings.squirrelly]
    
    @scala.inline
    def swig: typings.consolidate.consolidateStrings.swig = "swig".asInstanceOf[typings.consolidate.consolidateStrings.swig]
    
    @scala.inline
    def teacup: typings.consolidate.consolidateStrings.teacup = "teacup".asInstanceOf[typings.consolidate.consolidateStrings.teacup]
    
    @scala.inline
    def templayed: typings.consolidate.consolidateStrings.templayed = "templayed".asInstanceOf[typings.consolidate.consolidateStrings.templayed]
    
    @scala.inline
    def toffee: typings.consolidate.consolidateStrings.toffee = "toffee".asInstanceOf[typings.consolidate.consolidateStrings.toffee]
    
    @scala.inline
    def twig: typings.consolidate.consolidateStrings.twig = "twig".asInstanceOf[typings.consolidate.consolidateStrings.twig]
    
    @scala.inline
    def underscore: typings.consolidate.consolidateStrings.underscore = "underscore".asInstanceOf[typings.consolidate.consolidateStrings.underscore]
    
    @scala.inline
    def vash: typings.consolidate.consolidateStrings.vash = "vash".asInstanceOf[typings.consolidate.consolidateStrings.vash]
    
    @scala.inline
    def velocityjs: typings.consolidate.consolidateStrings.velocityjs = "velocityjs".asInstanceOf[typings.consolidate.consolidateStrings.velocityjs]
    
    @scala.inline
    def walrus: typings.consolidate.consolidateStrings.walrus = "walrus".asInstanceOf[typings.consolidate.consolidateStrings.walrus]
    
    @scala.inline
    def whiskers: typings.consolidate.consolidateStrings.whiskers = "whiskers".asInstanceOf[typings.consolidate.consolidateStrings.whiskers]
  }
  
  type _To = Consolidate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Consolidate = ^
}
