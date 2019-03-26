package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[TR, TJ, TN] extends js.Object {
  /**
    * Add handlers to be called when the Deferred object is either resolved or rejected.
    *
    * @param alwaysCallback A function, or array of functions, that is called when the Deferred is resolved or rejected.
    * @param alwaysCallbacks Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
    * @see \`{@link https://api.jquery.com/deferred.always/ }\`
    * @since 1.6
    */
  def always(
    alwaysCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TR | TJ]],
    alwaysCallbacks: (TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TR | TJ]])*
  ): this.type = js.native
  // endregion
  /**
    * Add handlers to be called when the Deferred object is rejected.
    *
    * @param failFilter A function that is called when the Deferred is rejected.
    * @see \`{@link https://api.jquery.com/deferred.catch/ }\`
    * @since 3.0
    */
  def `catch`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  def `catch`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved.
    *
    * @param doneCallback A function, or array of functions, that are called when the Deferred is resolved.
    * @param doneCallbacks Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
    * @see \`{@link https://api.jquery.com/deferred.done/ }\`
    * @since 1.5
    */
  def done(
    doneCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TR]],
    doneCallbacks: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TR]]*
  ): this.type = js.native
  /**
    * Add handlers to be called when the Deferred object is rejected.
    *
    * @param failCallback A function, or array of functions, that are called when the Deferred is rejected.
    * @param failCallbacks Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
    * @see \`{@link https://api.jquery.com/deferred.fail/ }\`
    * @since 1.5
    */
  def fail(
    failCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TJ]],
    failCallbacks: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TJ]]*
  ): this.type = js.native
  /**
    * Call the progressCallbacks on a Deferred object with the given args.
    *
    * @param args Optional arguments that are passed to the progressCallbacks.
    * @see \`{@link https://api.jquery.com/deferred.notify/ }\`
    * @since 1.7
    */
  def notify(args: TN*): this.type = js.native
  /**
    * Call the progressCallbacks on a Deferred object with the given context and args.
    *
    * @param context Context passed to the progressCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the progressCallbacks.
    * @see \`{@link https://api.jquery.com/deferred.notifyWith/ }\`
    * @since 1.7
    */
  def notifyWith(context: js.Object): this.type = js.native
  def notifyWith(context: js.Object, args: stdLib.ArrayLike[TN]): this.type = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ]
  ): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: scala.Null,
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: scala.Null,
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ]
  ): PromiseBase[
    ARD | ARF, 
    AJD | AJF, 
    AND | ANF, 
    BRD | BRF, 
    BJD | BJF, 
    BND | BNF, 
    CRD | CRF, 
    CJD | CJF, 
    CND | CNF, 
    RRD | RRF, 
    RJD | RJF, 
    RND | RNF
  ] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: scala.Null,
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARP, 
    AJD | AJP, 
    AND | ANP, 
    BRD | BRP, 
    BJD | BJP, 
    BND | BNP, 
    CRD | CRP, 
    CJD | CJP, 
    CND | CNP, 
    RRD | RRP, 
    RJD | RJP, 
    RND | RNP
  ] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ],
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARF | ARP, 
    AJF | AJP, 
    ANF | ANP, 
    BRF | BRP, 
    BJF | BJP, 
    BNF | BNP, 
    CRF | CRP, 
    CJF | CJP, 
    CNF | CNP, 
    RRF | RRP, 
    RJF | RJP, 
    RNF | RNP
  ] = js.native
  // region pipe
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link JQuery.Deferred.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ],
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARF | ARP, 
    AJD | AJF | AJP, 
    AND | ANF | ANP, 
    BRD | BRF | BRP, 
    BJD | BJF | BJP, 
    BND | BNF | BNP, 
    CRD | CRF | CRP, 
    CJD | CJF | CJP, 
    CND | CNF | CNP, 
    RRD | RRF | RRP, 
    RJD | RJF | RJP, 
    RND | RNF | RNP
  ] = js.native
  /**
    * Add handlers to be called when the Deferred object generates progress notifications.
    *
    * @param progressCallback A function, or array of functions, to be called when the Deferred generates progress notifications.
    * @param progressCallbacks Optional additional functions, or arrays of functions, to be called when the Deferred generates
    *                          progress notifications.
    * @see \`{@link https://api.jquery.com/deferred.progress/ }\`
    * @since 1.7
    */
  def progress(
    progressCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TN]],
    progressCallbacks: TypeOrArray[cypressLib.JQueryNs.DeferredNs.Callback[TN]]*
  ): this.type = js.native
  /**
    * Return a Deferred's Promise object.
    *
    * @see \`{@link https://api.jquery.com/deferred.promise/ }\`
    * @since 1.5
    */
  def promise(): Promise[TR, TJ, TN] = js.native
  /**
    * Return a Deferred's Promise object.
    *
    * @param target Object onto which the promise methods have to be attached
    * @see \`{@link https://api.jquery.com/deferred.promise/ }\`
    * @since 1.5
    */
  def promise[TTarget /* <: js.Object */](target: TTarget): (Promise[TR, TJ, TN]) with TTarget = js.native
  /**
    * Reject a Deferred object and call any failCallbacks with the given args.
    *
    * @param args Optional arguments that are passed to the failCallbacks.
    * @see \`{@link https://api.jquery.com/deferred.reject/ }\`
    * @since 1.5
    */
  def reject(args: TJ*): this.type = js.native
  /**
    * Reject a Deferred object and call any failCallbacks with the given context and args.
    *
    * @param context Context passed to the failCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the failCallbacks.
    * @see \`{@link https://api.jquery.com/deferred.rejectWith/ }\`
    * @since 1.5
    */
  def rejectWith(context: js.Object): this.type = js.native
  def rejectWith(context: js.Object, args: stdLib.ArrayLike[TJ]): this.type = js.native
  /**
    * Resolve a Deferred object and call any doneCallbacks with the given args.
    *
    * @param args Optional arguments that are passed to the doneCallbacks.
    * @see \`{@link https://api.jquery.com/deferred.resolve/ }\`
    * @since 1.5
    */
  def resolve(args: TR*): this.type = js.native
  /**
    * Resolve a Deferred object and call any doneCallbacks with the given context and args.
    *
    * @param context Context passed to the doneCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the doneCallbacks.
    * @see \`{@link https://api.jquery.com/deferred.resolveWith/ }\`
    * @since 1.5
    */
  def resolveWith(context: js.Object): this.type = js.native
  def resolveWith(context: js.Object, args: stdLib.ArrayLike[TR]): this.type = js.native
  /**
    * Determine the current state of a Deferred object.
    *
    * @see \`{@link https://api.jquery.com/deferred.state/ }\`
    * @since 1.7
    */
  def state(): cypressLib.cypressLibStrings.pending | cypressLib.cypressLibStrings.resolved | cypressLib.cypressLibStrings.rejected = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter A function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ]
  ): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: scala.Null,
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: scala.Null,
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[
    ARD | ARF, 
    AJD | AJF, 
    AND | ANF, 
    BRD | BRF, 
    BJD | BJF, 
    BND | BNF, 
    CRD | CRF, 
    CJD | CJF, 
    CND | CNF, 
    RRD | RRF, 
    RJD | RJF, 
    RND | RNF
  ] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter A function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: scala.Null,
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARP, 
    AJD | AJP, 
    AND | ANP, 
    BRD | BRP, 
    BJD | BJP, 
    BND | BNP, 
    CRD | CRP, 
    CJD | CJP, 
    CND | CNP, 
    RRD | RRP, 
    RJD | RJP, 
    RND | RNP
  ] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter A function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ],
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARF | ARP, 
    AJF | AJP, 
    ANF | ANP, 
    BRF | BRP, 
    BJF | BJP, 
    BNF | BNP, 
    CRF | CRP, 
    CJF | CJP, 
    CNF | CNP, 
    RRF | RRP, 
    RJF | RJP, 
    RNF | RNP
  ] = js.native
  // endregion
  // region then
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter A function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function1[
      /* repeated */ TR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function1[
      /* repeated */ TJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ],
    progressFilter: js.Function1[
      /* repeated */ TN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARF | ARP, 
    AJD | AJF | AJP, 
    AND | ANF | ANP, 
    BRD | BRF | BRP, 
    BJD | BJF | BJP, 
    BND | BNF | BNP, 
    CRD | CRF | CRP, 
    CJD | CJF | CJP, 
    CND | CNF | CNP, 
    RRD | RRF | RRP, 
    RJD | RJF | RJP, 
    RND | RNF | RNP
  ] = js.native
}

