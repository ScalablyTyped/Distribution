package typings.cspDev

import typings.cspDev.cspDevStrings.json
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Spec compliant content security policy builder and parser.
    */
  @JSImport("csp-dev", JSImport.Namespace)
  @js.native
  /**
    * @param data Optionally parse policy data.
    *
    * @example
    * import ContentSecurityPolicy = require('csp-dev');
    *
    * const data = `
    * default-src 'self';
    * script-src 'self' 'unsafe-inline' 'nonce-2726c7f26c' *.test.com;
    * style-src data:
    * `;
    * const parser = new ContentSecurityPolicy(data);
    */
  open class ^ ()
    extends StObject
       with ContentSecurityPolicy {
    def this(data: String) = this()
  }
  
  /**
    * Spec compliant content security policy builder and parser.
    */
  @js.native
  trait ContentSecurityPolicy extends StObject {
    
    /**
      * Build a policy by loading a descriptor object.
      *
      * @example
      * import ContentSecurityPolicy = require('csp-dev');
      *
      * const builder = new ContentSecurityPolicy();
      * builder.load({
      *   'default-src': ['self'],
      *   'script-src': [
      *     'self', 'unsafe-inline', 'nonce-2726c7f26c', '*.test.com'
      *   ],
      *   'style-src': ['data:']
      * });
      */
    def load(directiveDescriptor: DirectiveDescriptor): this.type = js.native
    
    /**
      * Add a policy directive.
      *
      * @example
      * import ContentSecurityPolicy = require('csp-dev');
      *
      * const builder = new ContentSecurityPolicy();
      * builder.newDirective('script-src', ['self', 'unsafe-inline', 'nonce-2726c7f26c', '*.test.com']);
      * builder.newDirective('default-src', 'self');
      * builder.newDirective('style-src', 'data:');
      */
    def newDirective(directive: Directive, sources: String): this.type = js.native
    def newDirective(directive: Directive, sources: js.Array[String]): this.type = js.native
    
    /**
      * Share data as json, spec compliant csp string or html meta tag.
      *
      * @example
      * import ContentSecurityPolicy = require('csp-dev');
      *
      * const parser = new ContentSecurityPolicy(`
      * default-src 'self';
      * script-src 'self' 'unsafe-inline' 'nonce-2726c7f26c' *.test.com;
      * style-src data:
      * `);
      *
      * parser.share('json');
      * // {
      * //   'default-src': ['self'],
      * //   'script-src': [
      * //     'self', 'unsafe-inline', 'nonce-2726c7f26c', '*.test.com'
      * //   ],
      * //   'style-src': ['data:']
      * // }
      *
      * parser.share('string');
      * // "default-src 'self'; script-src 'self' 'unsafe-inline' 'nonce-2726c7f26c' *.test.com; style-src data:"
      *
      * parser.share('html');
      * // "<meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'self'; script-src 'self' 'unsafe-inline' 'nonce-2726c7f26c' *.test.com; style-src data:\">"
      */
    @JSName("share")
    def share_json(format: json): DirectiveDescriptor = js.native
    @JSName("share")
    def share_json(format: Exclude[ShareFormat, json]): String = js.native
    
    /**
      * Validate parsed data.
      *
      * @example
      * import ContentSecurityPolicy = require('csp-dev');
      *
      * const data = `
      * default-src 'self';
      * script-src 'self' 'unsafe-inline' 'nonce-2726c7f26c' *.test.com;
      * style-src data:
      * `;
      * const parser = new ContentSecurityPolicy(data);
      *
      * parser.valid();
      */
    def valid(): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cspDev.cspDevStrings.`child-src`
    - typings.cspDev.cspDevStrings.`connect-src`
    - typings.cspDev.cspDevStrings.`default-src`
    - typings.cspDev.cspDevStrings.`font-src`
    - typings.cspDev.cspDevStrings.`frame-src`
    - typings.cspDev.cspDevStrings.`img-src`
    - typings.cspDev.cspDevStrings.`manifest-src`
    - typings.cspDev.cspDevStrings.`media-src`
    - typings.cspDev.cspDevStrings.`object-src`
    - typings.cspDev.cspDevStrings.`script-src`
    - typings.cspDev.cspDevStrings.`style-src`
    - typings.cspDev.cspDevStrings.`base-uri`
    - typings.cspDev.cspDevStrings.`plugin-types`
    - typings.cspDev.cspDevStrings.sandbox
    - typings.cspDev.cspDevStrings.`form-action`
    - typings.cspDev.cspDevStrings.`frame-ancestors`
    - typings.cspDev.cspDevStrings.`block-all-mixed-content`
    - typings.cspDev.cspDevStrings.`upgrade-insecure-requests`
  */
  trait Directive extends StObject
  object Directive {
    
    inline def `base-uri`: typings.cspDev.cspDevStrings.`base-uri` = "base-uri".asInstanceOf[typings.cspDev.cspDevStrings.`base-uri`]
    
    inline def `block-all-mixed-content`: typings.cspDev.cspDevStrings.`block-all-mixed-content` = "block-all-mixed-content".asInstanceOf[typings.cspDev.cspDevStrings.`block-all-mixed-content`]
    
    inline def `child-src`: typings.cspDev.cspDevStrings.`child-src` = "child-src".asInstanceOf[typings.cspDev.cspDevStrings.`child-src`]
    
    inline def `connect-src`: typings.cspDev.cspDevStrings.`connect-src` = "connect-src".asInstanceOf[typings.cspDev.cspDevStrings.`connect-src`]
    
    inline def `default-src`: typings.cspDev.cspDevStrings.`default-src` = "default-src".asInstanceOf[typings.cspDev.cspDevStrings.`default-src`]
    
    inline def `font-src`: typings.cspDev.cspDevStrings.`font-src` = "font-src".asInstanceOf[typings.cspDev.cspDevStrings.`font-src`]
    
    inline def `form-action`: typings.cspDev.cspDevStrings.`form-action` = "form-action".asInstanceOf[typings.cspDev.cspDevStrings.`form-action`]
    
    inline def `frame-ancestors`: typings.cspDev.cspDevStrings.`frame-ancestors` = "frame-ancestors".asInstanceOf[typings.cspDev.cspDevStrings.`frame-ancestors`]
    
    inline def `frame-src`: typings.cspDev.cspDevStrings.`frame-src` = "frame-src".asInstanceOf[typings.cspDev.cspDevStrings.`frame-src`]
    
    inline def `img-src`: typings.cspDev.cspDevStrings.`img-src` = "img-src".asInstanceOf[typings.cspDev.cspDevStrings.`img-src`]
    
    inline def `manifest-src`: typings.cspDev.cspDevStrings.`manifest-src` = "manifest-src".asInstanceOf[typings.cspDev.cspDevStrings.`manifest-src`]
    
    inline def `media-src`: typings.cspDev.cspDevStrings.`media-src` = "media-src".asInstanceOf[typings.cspDev.cspDevStrings.`media-src`]
    
    inline def `object-src`: typings.cspDev.cspDevStrings.`object-src` = "object-src".asInstanceOf[typings.cspDev.cspDevStrings.`object-src`]
    
    inline def `plugin-types`: typings.cspDev.cspDevStrings.`plugin-types` = "plugin-types".asInstanceOf[typings.cspDev.cspDevStrings.`plugin-types`]
    
    inline def sandbox: typings.cspDev.cspDevStrings.sandbox = "sandbox".asInstanceOf[typings.cspDev.cspDevStrings.sandbox]
    
    inline def `script-src`: typings.cspDev.cspDevStrings.`script-src` = "script-src".asInstanceOf[typings.cspDev.cspDevStrings.`script-src`]
    
    inline def `style-src`: typings.cspDev.cspDevStrings.`style-src` = "style-src".asInstanceOf[typings.cspDev.cspDevStrings.`style-src`]
    
    inline def `upgrade-insecure-requests`: typings.cspDev.cspDevStrings.`upgrade-insecure-requests` = "upgrade-insecure-requests".asInstanceOf[typings.cspDev.cspDevStrings.`upgrade-insecure-requests`]
  }
  
  /* Inlined std.Partial<std.Record<csp-dev.csp-dev.Directive, std.Array<string>>> */
  trait DirectiveDescriptor extends StObject {
    
    var `base-uri`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `block-all-mixed-content`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `child-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `connect-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `default-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `font-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `form-action`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `frame-ancestors`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `frame-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `img-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `manifest-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `media-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `object-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `plugin-types`: js.UndefOr[js.Array[String]] = js.undefined
    
    var sandbox: js.UndefOr[js.Array[String]] = js.undefined
    
    var `script-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `style-src`: js.UndefOr[js.Array[String]] = js.undefined
    
    var `upgrade-insecure-requests`: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DirectiveDescriptor {
    
    inline def apply(): DirectiveDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectiveDescriptor]
    }
    
    extension [Self <: DirectiveDescriptor](x: Self) {
      
      inline def `setBase-uri`(value: js.Array[String]): Self = StObject.set(x, "base-uri", value.asInstanceOf[js.Any])
      
      inline def `setBase-uriUndefined`: Self = StObject.set(x, "base-uri", js.undefined)
      
      inline def `setBase-uriVarargs`(value: String*): Self = StObject.set(x, "base-uri", js.Array(value*))
      
      inline def `setBlock-all-mixed-content`(value: js.Array[String]): Self = StObject.set(x, "block-all-mixed-content", value.asInstanceOf[js.Any])
      
      inline def `setBlock-all-mixed-contentUndefined`: Self = StObject.set(x, "block-all-mixed-content", js.undefined)
      
      inline def `setBlock-all-mixed-contentVarargs`(value: String*): Self = StObject.set(x, "block-all-mixed-content", js.Array(value*))
      
      inline def `setChild-src`(value: js.Array[String]): Self = StObject.set(x, "child-src", value.asInstanceOf[js.Any])
      
      inline def `setChild-srcUndefined`: Self = StObject.set(x, "child-src", js.undefined)
      
      inline def `setChild-srcVarargs`(value: String*): Self = StObject.set(x, "child-src", js.Array(value*))
      
      inline def `setConnect-src`(value: js.Array[String]): Self = StObject.set(x, "connect-src", value.asInstanceOf[js.Any])
      
      inline def `setConnect-srcUndefined`: Self = StObject.set(x, "connect-src", js.undefined)
      
      inline def `setConnect-srcVarargs`(value: String*): Self = StObject.set(x, "connect-src", js.Array(value*))
      
      inline def `setDefault-src`(value: js.Array[String]): Self = StObject.set(x, "default-src", value.asInstanceOf[js.Any])
      
      inline def `setDefault-srcUndefined`: Self = StObject.set(x, "default-src", js.undefined)
      
      inline def `setDefault-srcVarargs`(value: String*): Self = StObject.set(x, "default-src", js.Array(value*))
      
      inline def `setFont-src`(value: js.Array[String]): Self = StObject.set(x, "font-src", value.asInstanceOf[js.Any])
      
      inline def `setFont-srcUndefined`: Self = StObject.set(x, "font-src", js.undefined)
      
      inline def `setFont-srcVarargs`(value: String*): Self = StObject.set(x, "font-src", js.Array(value*))
      
      inline def `setForm-action`(value: js.Array[String]): Self = StObject.set(x, "form-action", value.asInstanceOf[js.Any])
      
      inline def `setForm-actionUndefined`: Self = StObject.set(x, "form-action", js.undefined)
      
      inline def `setForm-actionVarargs`(value: String*): Self = StObject.set(x, "form-action", js.Array(value*))
      
      inline def `setFrame-ancestors`(value: js.Array[String]): Self = StObject.set(x, "frame-ancestors", value.asInstanceOf[js.Any])
      
      inline def `setFrame-ancestorsUndefined`: Self = StObject.set(x, "frame-ancestors", js.undefined)
      
      inline def `setFrame-ancestorsVarargs`(value: String*): Self = StObject.set(x, "frame-ancestors", js.Array(value*))
      
      inline def `setFrame-src`(value: js.Array[String]): Self = StObject.set(x, "frame-src", value.asInstanceOf[js.Any])
      
      inline def `setFrame-srcUndefined`: Self = StObject.set(x, "frame-src", js.undefined)
      
      inline def `setFrame-srcVarargs`(value: String*): Self = StObject.set(x, "frame-src", js.Array(value*))
      
      inline def `setImg-src`(value: js.Array[String]): Self = StObject.set(x, "img-src", value.asInstanceOf[js.Any])
      
      inline def `setImg-srcUndefined`: Self = StObject.set(x, "img-src", js.undefined)
      
      inline def `setImg-srcVarargs`(value: String*): Self = StObject.set(x, "img-src", js.Array(value*))
      
      inline def `setManifest-src`(value: js.Array[String]): Self = StObject.set(x, "manifest-src", value.asInstanceOf[js.Any])
      
      inline def `setManifest-srcUndefined`: Self = StObject.set(x, "manifest-src", js.undefined)
      
      inline def `setManifest-srcVarargs`(value: String*): Self = StObject.set(x, "manifest-src", js.Array(value*))
      
      inline def `setMedia-src`(value: js.Array[String]): Self = StObject.set(x, "media-src", value.asInstanceOf[js.Any])
      
      inline def `setMedia-srcUndefined`: Self = StObject.set(x, "media-src", js.undefined)
      
      inline def `setMedia-srcVarargs`(value: String*): Self = StObject.set(x, "media-src", js.Array(value*))
      
      inline def `setObject-src`(value: js.Array[String]): Self = StObject.set(x, "object-src", value.asInstanceOf[js.Any])
      
      inline def `setObject-srcUndefined`: Self = StObject.set(x, "object-src", js.undefined)
      
      inline def `setObject-srcVarargs`(value: String*): Self = StObject.set(x, "object-src", js.Array(value*))
      
      inline def `setPlugin-types`(value: js.Array[String]): Self = StObject.set(x, "plugin-types", value.asInstanceOf[js.Any])
      
      inline def `setPlugin-typesUndefined`: Self = StObject.set(x, "plugin-types", js.undefined)
      
      inline def `setPlugin-typesVarargs`(value: String*): Self = StObject.set(x, "plugin-types", js.Array(value*))
      
      inline def setSandbox(value: js.Array[String]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setSandboxVarargs(value: String*): Self = StObject.set(x, "sandbox", js.Array(value*))
      
      inline def `setScript-src`(value: js.Array[String]): Self = StObject.set(x, "script-src", value.asInstanceOf[js.Any])
      
      inline def `setScript-srcUndefined`: Self = StObject.set(x, "script-src", js.undefined)
      
      inline def `setScript-srcVarargs`(value: String*): Self = StObject.set(x, "script-src", js.Array(value*))
      
      inline def `setStyle-src`(value: js.Array[String]): Self = StObject.set(x, "style-src", value.asInstanceOf[js.Any])
      
      inline def `setStyle-srcUndefined`: Self = StObject.set(x, "style-src", js.undefined)
      
      inline def `setStyle-srcVarargs`(value: String*): Self = StObject.set(x, "style-src", js.Array(value*))
      
      inline def `setUpgrade-insecure-requests`(value: js.Array[String]): Self = StObject.set(x, "upgrade-insecure-requests", value.asInstanceOf[js.Any])
      
      inline def `setUpgrade-insecure-requestsUndefined`: Self = StObject.set(x, "upgrade-insecure-requests", js.undefined)
      
      inline def `setUpgrade-insecure-requestsVarargs`(value: String*): Self = StObject.set(x, "upgrade-insecure-requests", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cspDev.cspDevStrings.json
    - typings.cspDev.cspDevStrings.string
    - typings.cspDev.cspDevStrings.html
  */
  trait ShareFormat extends StObject
  object ShareFormat {
    
    inline def html: typings.cspDev.cspDevStrings.html = "html".asInstanceOf[typings.cspDev.cspDevStrings.html]
    
    inline def json: typings.cspDev.cspDevStrings.json = "json".asInstanceOf[typings.cspDev.cspDevStrings.json]
    
    inline def string: typings.cspDev.cspDevStrings.string = "string".asInstanceOf[typings.cspDev.cspDevStrings.string]
  }
}
