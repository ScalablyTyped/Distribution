```
/**
Define a [lazily evaluated](https://en.wikipedia.org/wiki/Lazy_evaluation) property on an object.

@param object - Object to add property to.
@param propertyName - Name of the property to add.
@param fn - Called the first time `propertyName` is accessed.

@example
```
import defineLazyProp = require('define-lazy-prop');

const unicorn = {
	// …
};

defineLazyProp(unicorn, 'rainbow', () => expensiveComputation());

app.on('user-action', () => {
	doSomething(unicorn.rainbow);
});
```
*/
```