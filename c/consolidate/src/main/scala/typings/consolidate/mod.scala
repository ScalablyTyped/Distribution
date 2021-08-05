package typings.consolidate

import org.scalablytyped.runtime.Shortcut
import typings.consolidate.anon.DictotherOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("consolidate", JSImport.Namespace)
  @js.native
  val ^ : Consolidate = js.native
  
  trait Consolidate
    extends StObject
       with ConsolidateType {
    
    /**
      * Clear the cache.
      *
      * @api public
      */
    def clearCache(): Unit
    
    /**
      * expose the instance of the engine
      */
    var requires: RequiresType
  }
  object Consolidate {
    
    inline def apply(
      `arc-templates`: RendererInterface,
      atpl: RendererInterface,
      bracket: RendererInterface,
      clearCache: () => Unit,
      dot: RendererInterface,
      dust: RendererInterface,
      eco: RendererInterface,
      ect: RendererInterface,
      ejs: RendererInterface,
      haml: RendererInterface,
      `haml-coffee`: RendererInterface,
      hamlet: RendererInterface,
      handlebars: RendererInterface,
      hogan: RendererInterface,
      htmling: RendererInterface,
      jade: RendererInterface,
      jazz: RendererInterface,
      jqtpl: RendererInterface,
      just: RendererInterface,
      liquid: RendererInterface,
      liquor: RendererInterface,
      lodash: RendererInterface,
      marko: RendererInterface,
      mote: RendererInterface,
      mustache: RendererInterface,
      nunjucks: RendererInterface,
      plates: RendererInterface,
      pug: RendererInterface,
      qejs: RendererInterface,
      ractive: RendererInterface,
      razor: RendererInterface,
      react: RendererInterface,
      requires: RequiresType,
      slm: RendererInterface,
      squirrelly: RendererInterface,
      swig: RendererInterface,
      teacup: RendererInterface,
      templayed: RendererInterface,
      toffee: RendererInterface,
      twig: RendererInterface,
      underscore: RendererInterface,
      vash: RendererInterface,
      velocityjs: RendererInterface,
      walrus: RendererInterface,
      whiskers: RendererInterface
    ): Consolidate = {
      val __obj = js.Dynamic.literal(atpl = atpl.asInstanceOf[js.Any], bracket = bracket.asInstanceOf[js.Any], clearCache = js.Any.fromFunction0(clearCache), dot = dot.asInstanceOf[js.Any], dust = dust.asInstanceOf[js.Any], eco = eco.asInstanceOf[js.Any], ect = ect.asInstanceOf[js.Any], ejs = ejs.asInstanceOf[js.Any], haml = haml.asInstanceOf[js.Any], hamlet = hamlet.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], hogan = hogan.asInstanceOf[js.Any], htmling = htmling.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], jazz = jazz.asInstanceOf[js.Any], jqtpl = jqtpl.asInstanceOf[js.Any], just = just.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], liquor = liquor.asInstanceOf[js.Any], lodash = lodash.asInstanceOf[js.Any], marko = marko.asInstanceOf[js.Any], mote = mote.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nunjucks = nunjucks.asInstanceOf[js.Any], plates = plates.asInstanceOf[js.Any], pug = pug.asInstanceOf[js.Any], qejs = qejs.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any], razor = razor.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], squirrelly = squirrelly.asInstanceOf[js.Any], swig = swig.asInstanceOf[js.Any], teacup = teacup.asInstanceOf[js.Any], templayed = templayed.asInstanceOf[js.Any], toffee = toffee.asInstanceOf[js.Any], twig = twig.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], vash = vash.asInstanceOf[js.Any], velocityjs = velocityjs.asInstanceOf[js.Any], walrus = walrus.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.updateDynamic("arc-templates")(`arc-templates`.asInstanceOf[js.Any])
      __obj.updateDynamic("haml-coffee")(`haml-coffee`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consolidate]
    }
    
    extension [Self <: Consolidate](x: Self) {
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setRequires(value: RequiresType): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ engine in consolidate.consolidate.SupportedTemplateEngines ]: consolidate.consolidate.RendererInterface} */
  trait ConsolidateType extends StObject {
    
    def `arc-templates`(path: String): typings.bluebird.mod.^[String]
    def `arc-templates`(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def `arc-templates`(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def `arc-templates`(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("arc-templates")
    var `arc-templates_Original`: RendererInterface
    
    def atpl(path: String): typings.bluebird.mod.^[String]
    def atpl(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def atpl(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def atpl(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("atpl")
    var atpl_Original: RendererInterface
    
    def bracket(path: String): typings.bluebird.mod.^[String]
    def bracket(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def bracket(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def bracket(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("bracket")
    var bracket_Original: RendererInterface
    
    def dot(path: String): typings.bluebird.mod.^[String]
    def dot(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def dot(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def dot(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("dot")
    var dot_Original: RendererInterface
    
    def dust(path: String): typings.bluebird.mod.^[String]
    def dust(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def dust(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def dust(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("dust")
    var dust_Original: RendererInterface
    
    def eco(path: String): typings.bluebird.mod.^[String]
    def eco(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def eco(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def eco(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("eco")
    var eco_Original: RendererInterface
    
    def ect(path: String): typings.bluebird.mod.^[String]
    def ect(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def ect(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def ect(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("ect")
    var ect_Original: RendererInterface
    
    def ejs(path: String): typings.bluebird.mod.^[String]
    def ejs(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def ejs(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def ejs(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("ejs")
    var ejs_Original: RendererInterface
    
    def haml(path: String): typings.bluebird.mod.^[String]
    def haml(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def haml(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def haml(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    
    def `haml-coffee`(path: String): typings.bluebird.mod.^[String]
    def `haml-coffee`(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def `haml-coffee`(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def `haml-coffee`(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("haml-coffee")
    var `haml-coffee_Original`: RendererInterface
    
    @JSName("haml")
    var haml_Original: RendererInterface
    
    def hamlet(path: String): typings.bluebird.mod.^[String]
    def hamlet(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def hamlet(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def hamlet(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("hamlet")
    var hamlet_Original: RendererInterface
    
    def handlebars(path: String): typings.bluebird.mod.^[String]
    def handlebars(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def handlebars(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def handlebars(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("handlebars")
    var handlebars_Original: RendererInterface
    
    def hogan(path: String): typings.bluebird.mod.^[String]
    def hogan(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def hogan(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def hogan(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("hogan")
    var hogan_Original: RendererInterface
    
    def htmling(path: String): typings.bluebird.mod.^[String]
    def htmling(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def htmling(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def htmling(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("htmling")
    var htmling_Original: RendererInterface
    
    def jade(path: String): typings.bluebird.mod.^[String]
    def jade(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def jade(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def jade(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("jade")
    var jade_Original: RendererInterface
    
    def jazz(path: String): typings.bluebird.mod.^[String]
    def jazz(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def jazz(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def jazz(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("jazz")
    var jazz_Original: RendererInterface
    
    def jqtpl(path: String): typings.bluebird.mod.^[String]
    def jqtpl(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def jqtpl(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def jqtpl(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("jqtpl")
    var jqtpl_Original: RendererInterface
    
    def just(path: String): typings.bluebird.mod.^[String]
    def just(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def just(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def just(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("just")
    var just_Original: RendererInterface
    
    def liquid(path: String): typings.bluebird.mod.^[String]
    def liquid(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def liquid(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def liquid(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("liquid")
    var liquid_Original: RendererInterface
    
    def liquor(path: String): typings.bluebird.mod.^[String]
    def liquor(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def liquor(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def liquor(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("liquor")
    var liquor_Original: RendererInterface
    
    def lodash(path: String): typings.bluebird.mod.^[String]
    def lodash(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def lodash(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def lodash(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("lodash")
    var lodash_Original: RendererInterface
    
    def marko(path: String): typings.bluebird.mod.^[String]
    def marko(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def marko(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def marko(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("marko")
    var marko_Original: RendererInterface
    
    def mote(path: String): typings.bluebird.mod.^[String]
    def mote(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def mote(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def mote(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("mote")
    var mote_Original: RendererInterface
    
    def mustache(path: String): typings.bluebird.mod.^[String]
    def mustache(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def mustache(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def mustache(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("mustache")
    var mustache_Original: RendererInterface
    
    def nunjucks(path: String): typings.bluebird.mod.^[String]
    def nunjucks(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def nunjucks(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def nunjucks(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("nunjucks")
    var nunjucks_Original: RendererInterface
    
    def plates(path: String): typings.bluebird.mod.^[String]
    def plates(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def plates(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def plates(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("plates")
    var plates_Original: RendererInterface
    
    def pug(path: String): typings.bluebird.mod.^[String]
    def pug(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def pug(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def pug(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("pug")
    var pug_Original: RendererInterface
    
    def qejs(path: String): typings.bluebird.mod.^[String]
    def qejs(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def qejs(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def qejs(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("qejs")
    var qejs_Original: RendererInterface
    
    def ractive(path: String): typings.bluebird.mod.^[String]
    def ractive(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def ractive(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def ractive(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("ractive")
    var ractive_Original: RendererInterface
    
    def razor(path: String): typings.bluebird.mod.^[String]
    def razor(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def razor(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def razor(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("razor")
    var razor_Original: RendererInterface
    
    def react(path: String): typings.bluebird.mod.^[String]
    def react(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def react(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def react(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("react")
    var react_Original: RendererInterface
    
    def slm(path: String): typings.bluebird.mod.^[String]
    def slm(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def slm(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def slm(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("slm")
    var slm_Original: RendererInterface
    
    def squirrelly(path: String): typings.bluebird.mod.^[String]
    def squirrelly(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def squirrelly(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def squirrelly(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("squirrelly")
    var squirrelly_Original: RendererInterface
    
    def swig(path: String): typings.bluebird.mod.^[String]
    def swig(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def swig(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def swig(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("swig")
    var swig_Original: RendererInterface
    
    def teacup(path: String): typings.bluebird.mod.^[String]
    def teacup(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def teacup(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def teacup(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("teacup")
    var teacup_Original: RendererInterface
    
    def templayed(path: String): typings.bluebird.mod.^[String]
    def templayed(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def templayed(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def templayed(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("templayed")
    var templayed_Original: RendererInterface
    
    def toffee(path: String): typings.bluebird.mod.^[String]
    def toffee(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def toffee(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def toffee(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("toffee")
    var toffee_Original: RendererInterface
    
    def twig(path: String): typings.bluebird.mod.^[String]
    def twig(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def twig(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def twig(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("twig")
    var twig_Original: RendererInterface
    
    def underscore(path: String): typings.bluebird.mod.^[String]
    def underscore(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def underscore(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def underscore(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("underscore")
    var underscore_Original: RendererInterface
    
    def vash(path: String): typings.bluebird.mod.^[String]
    def vash(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def vash(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def vash(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("vash")
    var vash_Original: RendererInterface
    
    def velocityjs(path: String): typings.bluebird.mod.^[String]
    def velocityjs(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def velocityjs(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def velocityjs(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("velocityjs")
    var velocityjs_Original: RendererInterface
    
    def walrus(path: String): typings.bluebird.mod.^[String]
    def walrus(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def walrus(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def walrus(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("walrus")
    var walrus_Original: RendererInterface
    
    def whiskers(path: String): typings.bluebird.mod.^[String]
    def whiskers(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any
    def whiskers(path: String, options: DictotherOptions): typings.bluebird.mod.^[String]
    def whiskers(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any
    @JSName("whiskers")
    var whiskers_Original: RendererInterface
  }
  object ConsolidateType {
    
    inline def apply(
      `arc-templates`: RendererInterface,
      atpl: RendererInterface,
      bracket: RendererInterface,
      dot: RendererInterface,
      dust: RendererInterface,
      eco: RendererInterface,
      ect: RendererInterface,
      ejs: RendererInterface,
      haml: RendererInterface,
      `haml-coffee`: RendererInterface,
      hamlet: RendererInterface,
      handlebars: RendererInterface,
      hogan: RendererInterface,
      htmling: RendererInterface,
      jade: RendererInterface,
      jazz: RendererInterface,
      jqtpl: RendererInterface,
      just: RendererInterface,
      liquid: RendererInterface,
      liquor: RendererInterface,
      lodash: RendererInterface,
      marko: RendererInterface,
      mote: RendererInterface,
      mustache: RendererInterface,
      nunjucks: RendererInterface,
      plates: RendererInterface,
      pug: RendererInterface,
      qejs: RendererInterface,
      ractive: RendererInterface,
      razor: RendererInterface,
      react: RendererInterface,
      slm: RendererInterface,
      squirrelly: RendererInterface,
      swig: RendererInterface,
      teacup: RendererInterface,
      templayed: RendererInterface,
      toffee: RendererInterface,
      twig: RendererInterface,
      underscore: RendererInterface,
      vash: RendererInterface,
      velocityjs: RendererInterface,
      walrus: RendererInterface,
      whiskers: RendererInterface
    ): ConsolidateType = {
      val __obj = js.Dynamic.literal(atpl = atpl.asInstanceOf[js.Any], bracket = bracket.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], dust = dust.asInstanceOf[js.Any], eco = eco.asInstanceOf[js.Any], ect = ect.asInstanceOf[js.Any], ejs = ejs.asInstanceOf[js.Any], haml = haml.asInstanceOf[js.Any], hamlet = hamlet.asInstanceOf[js.Any], handlebars = handlebars.asInstanceOf[js.Any], hogan = hogan.asInstanceOf[js.Any], htmling = htmling.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], jazz = jazz.asInstanceOf[js.Any], jqtpl = jqtpl.asInstanceOf[js.Any], just = just.asInstanceOf[js.Any], liquid = liquid.asInstanceOf[js.Any], liquor = liquor.asInstanceOf[js.Any], lodash = lodash.asInstanceOf[js.Any], marko = marko.asInstanceOf[js.Any], mote = mote.asInstanceOf[js.Any], mustache = mustache.asInstanceOf[js.Any], nunjucks = nunjucks.asInstanceOf[js.Any], plates = plates.asInstanceOf[js.Any], pug = pug.asInstanceOf[js.Any], qejs = qejs.asInstanceOf[js.Any], ractive = ractive.asInstanceOf[js.Any], razor = razor.asInstanceOf[js.Any], react = react.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], squirrelly = squirrelly.asInstanceOf[js.Any], swig = swig.asInstanceOf[js.Any], teacup = teacup.asInstanceOf[js.Any], templayed = templayed.asInstanceOf[js.Any], toffee = toffee.asInstanceOf[js.Any], twig = twig.asInstanceOf[js.Any], underscore = underscore.asInstanceOf[js.Any], vash = vash.asInstanceOf[js.Any], velocityjs = velocityjs.asInstanceOf[js.Any], walrus = walrus.asInstanceOf[js.Any], whiskers = whiskers.asInstanceOf[js.Any])
      __obj.updateDynamic("arc-templates")(`arc-templates`.asInstanceOf[js.Any])
      __obj.updateDynamic("haml-coffee")(`haml-coffee`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsolidateType]
    }
    
    extension [Self <: ConsolidateType](x: Self) {
      
      inline def `setArc-templates`(value: RendererInterface): Self = StObject.set(x, "arc-templates", value.asInstanceOf[js.Any])
      
      inline def setAtpl(value: RendererInterface): Self = StObject.set(x, "atpl", value.asInstanceOf[js.Any])
      
      inline def setBracket(value: RendererInterface): Self = StObject.set(x, "bracket", value.asInstanceOf[js.Any])
      
      inline def setDot(value: RendererInterface): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDust(value: RendererInterface): Self = StObject.set(x, "dust", value.asInstanceOf[js.Any])
      
      inline def setEco(value: RendererInterface): Self = StObject.set(x, "eco", value.asInstanceOf[js.Any])
      
      inline def setEct(value: RendererInterface): Self = StObject.set(x, "ect", value.asInstanceOf[js.Any])
      
      inline def setEjs(value: RendererInterface): Self = StObject.set(x, "ejs", value.asInstanceOf[js.Any])
      
      inline def setHaml(value: RendererInterface): Self = StObject.set(x, "haml", value.asInstanceOf[js.Any])
      
      inline def `setHaml-coffee`(value: RendererInterface): Self = StObject.set(x, "haml-coffee", value.asInstanceOf[js.Any])
      
      inline def setHamlet(value: RendererInterface): Self = StObject.set(x, "hamlet", value.asInstanceOf[js.Any])
      
      inline def setHandlebars(value: RendererInterface): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      inline def setHogan(value: RendererInterface): Self = StObject.set(x, "hogan", value.asInstanceOf[js.Any])
      
      inline def setHtmling(value: RendererInterface): Self = StObject.set(x, "htmling", value.asInstanceOf[js.Any])
      
      inline def setJade(value: RendererInterface): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      inline def setJazz(value: RendererInterface): Self = StObject.set(x, "jazz", value.asInstanceOf[js.Any])
      
      inline def setJqtpl(value: RendererInterface): Self = StObject.set(x, "jqtpl", value.asInstanceOf[js.Any])
      
      inline def setJust(value: RendererInterface): Self = StObject.set(x, "just", value.asInstanceOf[js.Any])
      
      inline def setLiquid(value: RendererInterface): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
      
      inline def setLiquor(value: RendererInterface): Self = StObject.set(x, "liquor", value.asInstanceOf[js.Any])
      
      inline def setLodash(value: RendererInterface): Self = StObject.set(x, "lodash", value.asInstanceOf[js.Any])
      
      inline def setMarko(value: RendererInterface): Self = StObject.set(x, "marko", value.asInstanceOf[js.Any])
      
      inline def setMote(value: RendererInterface): Self = StObject.set(x, "mote", value.asInstanceOf[js.Any])
      
      inline def setMustache(value: RendererInterface): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      inline def setNunjucks(value: RendererInterface): Self = StObject.set(x, "nunjucks", value.asInstanceOf[js.Any])
      
      inline def setPlates(value: RendererInterface): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      inline def setPug(value: RendererInterface): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      inline def setQejs(value: RendererInterface): Self = StObject.set(x, "qejs", value.asInstanceOf[js.Any])
      
      inline def setRactive(value: RendererInterface): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
      
      inline def setRazor(value: RendererInterface): Self = StObject.set(x, "razor", value.asInstanceOf[js.Any])
      
      inline def setReact(value: RendererInterface): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setSlm(value: RendererInterface): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
      
      inline def setSquirrelly(value: RendererInterface): Self = StObject.set(x, "squirrelly", value.asInstanceOf[js.Any])
      
      inline def setSwig(value: RendererInterface): Self = StObject.set(x, "swig", value.asInstanceOf[js.Any])
      
      inline def setTeacup(value: RendererInterface): Self = StObject.set(x, "teacup", value.asInstanceOf[js.Any])
      
      inline def setTemplayed(value: RendererInterface): Self = StObject.set(x, "templayed", value.asInstanceOf[js.Any])
      
      inline def setToffee(value: RendererInterface): Self = StObject.set(x, "toffee", value.asInstanceOf[js.Any])
      
      inline def setTwig(value: RendererInterface): Self = StObject.set(x, "twig", value.asInstanceOf[js.Any])
      
      inline def setUnderscore(value: RendererInterface): Self = StObject.set(x, "underscore", value.asInstanceOf[js.Any])
      
      inline def setVash(value: RendererInterface): Self = StObject.set(x, "vash", value.asInstanceOf[js.Any])
      
      inline def setVelocityjs(value: RendererInterface): Self = StObject.set(x, "velocityjs", value.asInstanceOf[js.Any])
      
      inline def setWalrus(value: RendererInterface): Self = StObject.set(x, "walrus", value.asInstanceOf[js.Any])
      
      inline def setWhiskers(value: RendererInterface): Self = StObject.set(x, "whiskers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RendererInterface extends StObject {
    
    def apply(path: String): typings.bluebird.mod.^[String] = js.native
    def apply(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any = js.native
    def apply(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def apply(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any = js.native
    
    def render(path: String): typings.bluebird.mod.^[String] = js.native
    def render(path: String, fn: js.Function2[/* err */ Error, /* html */ String, js.Any]): js.Any = js.native
    def render(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
    def render(
      path: String,
      options: DictotherOptions,
      fn: js.Function2[/* err */ Error, /* html */ String, js.Any]
    ): js.Any = js.native
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
    
    inline def ReactDOM: typings.consolidate.consolidateStrings.ReactDOM = "ReactDOM".asInstanceOf[typings.consolidate.consolidateStrings.ReactDOM]
    
    inline def `arc-templates`: typings.consolidate.consolidateStrings.`arc-templates` = "arc-templates".asInstanceOf[typings.consolidate.consolidateStrings.`arc-templates`]
    
    inline def atpl: typings.consolidate.consolidateStrings.atpl = "atpl".asInstanceOf[typings.consolidate.consolidateStrings.atpl]
    
    inline def babel: typings.consolidate.consolidateStrings.babel = "babel".asInstanceOf[typings.consolidate.consolidateStrings.babel]
    
    inline def bracket: typings.consolidate.consolidateStrings.bracket = "bracket".asInstanceOf[typings.consolidate.consolidateStrings.bracket]
    
    inline def dot: typings.consolidate.consolidateStrings.dot = "dot".asInstanceOf[typings.consolidate.consolidateStrings.dot]
    
    inline def dust: typings.consolidate.consolidateStrings.dust = "dust".asInstanceOf[typings.consolidate.consolidateStrings.dust]
    
    inline def eco: typings.consolidate.consolidateStrings.eco = "eco".asInstanceOf[typings.consolidate.consolidateStrings.eco]
    
    inline def ect: typings.consolidate.consolidateStrings.ect = "ect".asInstanceOf[typings.consolidate.consolidateStrings.ect]
    
    inline def ejs: typings.consolidate.consolidateStrings.ejs = "ejs".asInstanceOf[typings.consolidate.consolidateStrings.ejs]
    
    inline def extend: typings.consolidate.consolidateStrings.extend = "extend".asInstanceOf[typings.consolidate.consolidateStrings.extend]
    
    inline def haml: typings.consolidate.consolidateStrings.haml = "haml".asInstanceOf[typings.consolidate.consolidateStrings.haml]
    
    inline def `haml-coffee`: typings.consolidate.consolidateStrings.`haml-coffee` = "haml-coffee".asInstanceOf[typings.consolidate.consolidateStrings.`haml-coffee`]
    
    inline def hamlet: typings.consolidate.consolidateStrings.hamlet = "hamlet".asInstanceOf[typings.consolidate.consolidateStrings.hamlet]
    
    inline def handlebars: typings.consolidate.consolidateStrings.handlebars = "handlebars".asInstanceOf[typings.consolidate.consolidateStrings.handlebars]
    
    inline def hogan: typings.consolidate.consolidateStrings.hogan = "hogan".asInstanceOf[typings.consolidate.consolidateStrings.hogan]
    
    inline def htmling: typings.consolidate.consolidateStrings.htmling = "htmling".asInstanceOf[typings.consolidate.consolidateStrings.htmling]
    
    inline def jade: typings.consolidate.consolidateStrings.jade = "jade".asInstanceOf[typings.consolidate.consolidateStrings.jade]
    
    inline def jazz: typings.consolidate.consolidateStrings.jazz = "jazz".asInstanceOf[typings.consolidate.consolidateStrings.jazz]
    
    inline def jqtpl: typings.consolidate.consolidateStrings.jqtpl = "jqtpl".asInstanceOf[typings.consolidate.consolidateStrings.jqtpl]
    
    inline def just: typings.consolidate.consolidateStrings.just = "just".asInstanceOf[typings.consolidate.consolidateStrings.just]
    
    inline def liquid: typings.consolidate.consolidateStrings.liquid = "liquid".asInstanceOf[typings.consolidate.consolidateStrings.liquid]
    
    inline def liquor: typings.consolidate.consolidateStrings.liquor = "liquor".asInstanceOf[typings.consolidate.consolidateStrings.liquor]
    
    inline def lodash: typings.consolidate.consolidateStrings.lodash = "lodash".asInstanceOf[typings.consolidate.consolidateStrings.lodash]
    
    inline def marko: typings.consolidate.consolidateStrings.marko = "marko".asInstanceOf[typings.consolidate.consolidateStrings.marko]
    
    inline def mote: typings.consolidate.consolidateStrings.mote = "mote".asInstanceOf[typings.consolidate.consolidateStrings.mote]
    
    inline def mustache: typings.consolidate.consolidateStrings.mustache = "mustache".asInstanceOf[typings.consolidate.consolidateStrings.mustache]
    
    inline def nunjucks: typings.consolidate.consolidateStrings.nunjucks = "nunjucks".asInstanceOf[typings.consolidate.consolidateStrings.nunjucks]
    
    inline def plates: typings.consolidate.consolidateStrings.plates = "plates".asInstanceOf[typings.consolidate.consolidateStrings.plates]
    
    inline def pug: typings.consolidate.consolidateStrings.pug = "pug".asInstanceOf[typings.consolidate.consolidateStrings.pug]
    
    inline def qejs: typings.consolidate.consolidateStrings.qejs = "qejs".asInstanceOf[typings.consolidate.consolidateStrings.qejs]
    
    inline def ractive: typings.consolidate.consolidateStrings.ractive = "ractive".asInstanceOf[typings.consolidate.consolidateStrings.ractive]
    
    inline def razor: typings.consolidate.consolidateStrings.razor = "razor".asInstanceOf[typings.consolidate.consolidateStrings.razor]
    
    inline def react: typings.consolidate.consolidateStrings.react = "react".asInstanceOf[typings.consolidate.consolidateStrings.react]
    
    inline def slm: typings.consolidate.consolidateStrings.slm = "slm".asInstanceOf[typings.consolidate.consolidateStrings.slm]
    
    inline def squirrelly: typings.consolidate.consolidateStrings.squirrelly = "squirrelly".asInstanceOf[typings.consolidate.consolidateStrings.squirrelly]
    
    inline def swig: typings.consolidate.consolidateStrings.swig = "swig".asInstanceOf[typings.consolidate.consolidateStrings.swig]
    
    inline def teacup: typings.consolidate.consolidateStrings.teacup = "teacup".asInstanceOf[typings.consolidate.consolidateStrings.teacup]
    
    inline def templayed: typings.consolidate.consolidateStrings.templayed = "templayed".asInstanceOf[typings.consolidate.consolidateStrings.templayed]
    
    inline def toffee: typings.consolidate.consolidateStrings.toffee = "toffee".asInstanceOf[typings.consolidate.consolidateStrings.toffee]
    
    inline def twig: typings.consolidate.consolidateStrings.twig = "twig".asInstanceOf[typings.consolidate.consolidateStrings.twig]
    
    inline def underscore: typings.consolidate.consolidateStrings.underscore = "underscore".asInstanceOf[typings.consolidate.consolidateStrings.underscore]
    
    inline def vash: typings.consolidate.consolidateStrings.vash = "vash".asInstanceOf[typings.consolidate.consolidateStrings.vash]
    
    inline def velocityjs: typings.consolidate.consolidateStrings.velocityjs = "velocityjs".asInstanceOf[typings.consolidate.consolidateStrings.velocityjs]
    
    inline def walrus: typings.consolidate.consolidateStrings.walrus = "walrus".asInstanceOf[typings.consolidate.consolidateStrings.walrus]
    
    inline def whiskers: typings.consolidate.consolidateStrings.whiskers = "whiskers".asInstanceOf[typings.consolidate.consolidateStrings.whiskers]
  }
  
  /* Inlined {[ engine in consolidate.consolidate.Requires ]: any} */
  trait RequiresType extends StObject {
    
    var ReactDOM: js.Any
    
    var `arc-templates`: js.Any
    
    var atpl: js.Any
    
    var babel: js.Any
    
    var bracket: js.Any
    
    var dot: js.Any
    
    var dust: js.Any
    
    var eco: js.Any
    
    var ect: js.Any
    
    var ejs: js.Any
    
    var extend: js.Any
    
    var haml: js.Any
    
    var `haml-coffee`: js.Any
    
    var hamlet: js.Any
    
    var handlebars: js.Any
    
    var hogan: js.Any
    
    var htmling: js.Any
    
    var jade: js.Any
    
    var jazz: js.Any
    
    var jqtpl: js.Any
    
    var just: js.Any
    
    var liquid: js.Any
    
    var liquor: js.Any
    
    var lodash: js.Any
    
    var marko: js.Any
    
    var mote: js.Any
    
    var mustache: js.Any
    
    var nunjucks: js.Any
    
    var plates: js.Any
    
    var pug: js.Any
    
    var qejs: js.Any
    
    var ractive: js.Any
    
    var razor: js.Any
    
    var react: js.Any
    
    var slm: js.Any
    
    var squirrelly: js.Any
    
    var swig: js.Any
    
    var teacup: js.Any
    
    var templayed: js.Any
    
    var toffee: js.Any
    
    var twig: js.Any
    
    var underscore: js.Any
    
    var vash: js.Any
    
    var velocityjs: js.Any
    
    var walrus: js.Any
    
    var whiskers: js.Any
  }
  object RequiresType {
    
    inline def apply(
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
    
    extension [Self <: RequiresType](x: Self) {
      
      inline def `setArc-templates`(value: js.Any): Self = StObject.set(x, "arc-templates", value.asInstanceOf[js.Any])
      
      inline def setAtpl(value: js.Any): Self = StObject.set(x, "atpl", value.asInstanceOf[js.Any])
      
      inline def setBabel(value: js.Any): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setBracket(value: js.Any): Self = StObject.set(x, "bracket", value.asInstanceOf[js.Any])
      
      inline def setDot(value: js.Any): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDust(value: js.Any): Self = StObject.set(x, "dust", value.asInstanceOf[js.Any])
      
      inline def setEco(value: js.Any): Self = StObject.set(x, "eco", value.asInstanceOf[js.Any])
      
      inline def setEct(value: js.Any): Self = StObject.set(x, "ect", value.asInstanceOf[js.Any])
      
      inline def setEjs(value: js.Any): Self = StObject.set(x, "ejs", value.asInstanceOf[js.Any])
      
      inline def setExtend(value: js.Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setHaml(value: js.Any): Self = StObject.set(x, "haml", value.asInstanceOf[js.Any])
      
      inline def `setHaml-coffee`(value: js.Any): Self = StObject.set(x, "haml-coffee", value.asInstanceOf[js.Any])
      
      inline def setHamlet(value: js.Any): Self = StObject.set(x, "hamlet", value.asInstanceOf[js.Any])
      
      inline def setHandlebars(value: js.Any): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
      
      inline def setHogan(value: js.Any): Self = StObject.set(x, "hogan", value.asInstanceOf[js.Any])
      
      inline def setHtmling(value: js.Any): Self = StObject.set(x, "htmling", value.asInstanceOf[js.Any])
      
      inline def setJade(value: js.Any): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      inline def setJazz(value: js.Any): Self = StObject.set(x, "jazz", value.asInstanceOf[js.Any])
      
      inline def setJqtpl(value: js.Any): Self = StObject.set(x, "jqtpl", value.asInstanceOf[js.Any])
      
      inline def setJust(value: js.Any): Self = StObject.set(x, "just", value.asInstanceOf[js.Any])
      
      inline def setLiquid(value: js.Any): Self = StObject.set(x, "liquid", value.asInstanceOf[js.Any])
      
      inline def setLiquor(value: js.Any): Self = StObject.set(x, "liquor", value.asInstanceOf[js.Any])
      
      inline def setLodash(value: js.Any): Self = StObject.set(x, "lodash", value.asInstanceOf[js.Any])
      
      inline def setMarko(value: js.Any): Self = StObject.set(x, "marko", value.asInstanceOf[js.Any])
      
      inline def setMote(value: js.Any): Self = StObject.set(x, "mote", value.asInstanceOf[js.Any])
      
      inline def setMustache(value: js.Any): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      inline def setNunjucks(value: js.Any): Self = StObject.set(x, "nunjucks", value.asInstanceOf[js.Any])
      
      inline def setPlates(value: js.Any): Self = StObject.set(x, "plates", value.asInstanceOf[js.Any])
      
      inline def setPug(value: js.Any): Self = StObject.set(x, "pug", value.asInstanceOf[js.Any])
      
      inline def setQejs(value: js.Any): Self = StObject.set(x, "qejs", value.asInstanceOf[js.Any])
      
      inline def setRactive(value: js.Any): Self = StObject.set(x, "ractive", value.asInstanceOf[js.Any])
      
      inline def setRazor(value: js.Any): Self = StObject.set(x, "razor", value.asInstanceOf[js.Any])
      
      inline def setReact(value: js.Any): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      inline def setReactDOM(value: js.Any): Self = StObject.set(x, "ReactDOM", value.asInstanceOf[js.Any])
      
      inline def setSlm(value: js.Any): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
      
      inline def setSquirrelly(value: js.Any): Self = StObject.set(x, "squirrelly", value.asInstanceOf[js.Any])
      
      inline def setSwig(value: js.Any): Self = StObject.set(x, "swig", value.asInstanceOf[js.Any])
      
      inline def setTeacup(value: js.Any): Self = StObject.set(x, "teacup", value.asInstanceOf[js.Any])
      
      inline def setTemplayed(value: js.Any): Self = StObject.set(x, "templayed", value.asInstanceOf[js.Any])
      
      inline def setToffee(value: js.Any): Self = StObject.set(x, "toffee", value.asInstanceOf[js.Any])
      
      inline def setTwig(value: js.Any): Self = StObject.set(x, "twig", value.asInstanceOf[js.Any])
      
      inline def setUnderscore(value: js.Any): Self = StObject.set(x, "underscore", value.asInstanceOf[js.Any])
      
      inline def setVash(value: js.Any): Self = StObject.set(x, "vash", value.asInstanceOf[js.Any])
      
      inline def setVelocityjs(value: js.Any): Self = StObject.set(x, "velocityjs", value.asInstanceOf[js.Any])
      
      inline def setWalrus(value: js.Any): Self = StObject.set(x, "walrus", value.asInstanceOf[js.Any])
      
      inline def setWhiskers(value: js.Any): Self = StObject.set(x, "whiskers", value.asInstanceOf[js.Any])
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
    
    inline def `arc-templates`: typings.consolidate.consolidateStrings.`arc-templates` = "arc-templates".asInstanceOf[typings.consolidate.consolidateStrings.`arc-templates`]
    
    inline def atpl: typings.consolidate.consolidateStrings.atpl = "atpl".asInstanceOf[typings.consolidate.consolidateStrings.atpl]
    
    inline def bracket: typings.consolidate.consolidateStrings.bracket = "bracket".asInstanceOf[typings.consolidate.consolidateStrings.bracket]
    
    inline def dot: typings.consolidate.consolidateStrings.dot = "dot".asInstanceOf[typings.consolidate.consolidateStrings.dot]
    
    inline def dust: typings.consolidate.consolidateStrings.dust = "dust".asInstanceOf[typings.consolidate.consolidateStrings.dust]
    
    inline def eco: typings.consolidate.consolidateStrings.eco = "eco".asInstanceOf[typings.consolidate.consolidateStrings.eco]
    
    inline def ect: typings.consolidate.consolidateStrings.ect = "ect".asInstanceOf[typings.consolidate.consolidateStrings.ect]
    
    inline def ejs: typings.consolidate.consolidateStrings.ejs = "ejs".asInstanceOf[typings.consolidate.consolidateStrings.ejs]
    
    inline def haml: typings.consolidate.consolidateStrings.haml = "haml".asInstanceOf[typings.consolidate.consolidateStrings.haml]
    
    inline def `haml-coffee`: typings.consolidate.consolidateStrings.`haml-coffee` = "haml-coffee".asInstanceOf[typings.consolidate.consolidateStrings.`haml-coffee`]
    
    inline def hamlet: typings.consolidate.consolidateStrings.hamlet = "hamlet".asInstanceOf[typings.consolidate.consolidateStrings.hamlet]
    
    inline def handlebars: typings.consolidate.consolidateStrings.handlebars = "handlebars".asInstanceOf[typings.consolidate.consolidateStrings.handlebars]
    
    inline def hogan: typings.consolidate.consolidateStrings.hogan = "hogan".asInstanceOf[typings.consolidate.consolidateStrings.hogan]
    
    inline def htmling: typings.consolidate.consolidateStrings.htmling = "htmling".asInstanceOf[typings.consolidate.consolidateStrings.htmling]
    
    inline def jade: typings.consolidate.consolidateStrings.jade = "jade".asInstanceOf[typings.consolidate.consolidateStrings.jade]
    
    inline def jazz: typings.consolidate.consolidateStrings.jazz = "jazz".asInstanceOf[typings.consolidate.consolidateStrings.jazz]
    
    inline def jqtpl: typings.consolidate.consolidateStrings.jqtpl = "jqtpl".asInstanceOf[typings.consolidate.consolidateStrings.jqtpl]
    
    inline def just: typings.consolidate.consolidateStrings.just = "just".asInstanceOf[typings.consolidate.consolidateStrings.just]
    
    inline def liquid: typings.consolidate.consolidateStrings.liquid = "liquid".asInstanceOf[typings.consolidate.consolidateStrings.liquid]
    
    inline def liquor: typings.consolidate.consolidateStrings.liquor = "liquor".asInstanceOf[typings.consolidate.consolidateStrings.liquor]
    
    inline def lodash: typings.consolidate.consolidateStrings.lodash = "lodash".asInstanceOf[typings.consolidate.consolidateStrings.lodash]
    
    inline def marko: typings.consolidate.consolidateStrings.marko = "marko".asInstanceOf[typings.consolidate.consolidateStrings.marko]
    
    inline def mote: typings.consolidate.consolidateStrings.mote = "mote".asInstanceOf[typings.consolidate.consolidateStrings.mote]
    
    inline def mustache: typings.consolidate.consolidateStrings.mustache = "mustache".asInstanceOf[typings.consolidate.consolidateStrings.mustache]
    
    inline def nunjucks: typings.consolidate.consolidateStrings.nunjucks = "nunjucks".asInstanceOf[typings.consolidate.consolidateStrings.nunjucks]
    
    inline def plates: typings.consolidate.consolidateStrings.plates = "plates".asInstanceOf[typings.consolidate.consolidateStrings.plates]
    
    inline def pug: typings.consolidate.consolidateStrings.pug = "pug".asInstanceOf[typings.consolidate.consolidateStrings.pug]
    
    inline def qejs: typings.consolidate.consolidateStrings.qejs = "qejs".asInstanceOf[typings.consolidate.consolidateStrings.qejs]
    
    inline def ractive: typings.consolidate.consolidateStrings.ractive = "ractive".asInstanceOf[typings.consolidate.consolidateStrings.ractive]
    
    inline def razor: typings.consolidate.consolidateStrings.razor = "razor".asInstanceOf[typings.consolidate.consolidateStrings.razor]
    
    inline def react: typings.consolidate.consolidateStrings.react = "react".asInstanceOf[typings.consolidate.consolidateStrings.react]
    
    inline def slm: typings.consolidate.consolidateStrings.slm = "slm".asInstanceOf[typings.consolidate.consolidateStrings.slm]
    
    inline def squirrelly: typings.consolidate.consolidateStrings.squirrelly = "squirrelly".asInstanceOf[typings.consolidate.consolidateStrings.squirrelly]
    
    inline def swig: typings.consolidate.consolidateStrings.swig = "swig".asInstanceOf[typings.consolidate.consolidateStrings.swig]
    
    inline def teacup: typings.consolidate.consolidateStrings.teacup = "teacup".asInstanceOf[typings.consolidate.consolidateStrings.teacup]
    
    inline def templayed: typings.consolidate.consolidateStrings.templayed = "templayed".asInstanceOf[typings.consolidate.consolidateStrings.templayed]
    
    inline def toffee: typings.consolidate.consolidateStrings.toffee = "toffee".asInstanceOf[typings.consolidate.consolidateStrings.toffee]
    
    inline def twig: typings.consolidate.consolidateStrings.twig = "twig".asInstanceOf[typings.consolidate.consolidateStrings.twig]
    
    inline def underscore: typings.consolidate.consolidateStrings.underscore = "underscore".asInstanceOf[typings.consolidate.consolidateStrings.underscore]
    
    inline def vash: typings.consolidate.consolidateStrings.vash = "vash".asInstanceOf[typings.consolidate.consolidateStrings.vash]
    
    inline def velocityjs: typings.consolidate.consolidateStrings.velocityjs = "velocityjs".asInstanceOf[typings.consolidate.consolidateStrings.velocityjs]
    
    inline def walrus: typings.consolidate.consolidateStrings.walrus = "walrus".asInstanceOf[typings.consolidate.consolidateStrings.walrus]
    
    inline def whiskers: typings.consolidate.consolidateStrings.whiskers = "whiskers".asInstanceOf[typings.consolidate.consolidateStrings.whiskers]
  }
  
  type _To = Consolidate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Consolidate = ^
}
